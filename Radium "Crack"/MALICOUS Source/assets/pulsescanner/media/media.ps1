# Pulse Scanner media helper (Windows).
# Reads the current media session (Spotify preferred) from the Windows media controls (GSMTC) and prints one JSON
# line per update to stdout. Commands (play/pause/next/prev) are read from a command file the mod writes.
param(
    [int]$ParentPid = 0,
    [string]$ArtDir = $env:TEMP,
    [string]$CmdFile = "",
    [int]$ArtSize = 96
)

$ErrorActionPreference = 'Stop'
[Console]::OutputEncoding = [System.Text.Encoding]::UTF8
Add-Type -AssemblyName System.Runtime.WindowsRuntime
Add-Type -AssemblyName System.Drawing

$asTaskGeneric = ([System.WindowsRuntimeSystemExtensions].GetMethods() | Where-Object {
    $_.Name -eq 'AsTask' -and $_.GetParameters().Count -eq 1 -and $_.GetParameters()[0].ParameterType.Name -eq 'IAsyncOperation`1'
})[0]
function Await($op, [Type]$type) {
    $task = $asTaskGeneric.MakeGenericMethod($type).Invoke($null, @($op))
    $task.Wait(3000) | Out-Null
    return $task.Result
}

[Windows.Media.Control.GlobalSystemMediaTransportControlsSessionManager, Windows.Media.Control, ContentType = WindowsRuntime] | Out-Null
[Windows.Storage.Streams.IRandomAccessStreamWithContentType, Windows.Storage.Streams, ContentType = WindowsRuntime] | Out-Null
[Windows.Storage.Streams.IRandomAccessStream, Windows.Storage.Streams, ContentType = WindowsRuntime] | Out-Null
$asStream = [System.IO.WindowsRuntimeStreamExtensions].GetMethod('AsStream', [Type[]]@([Windows.Storage.Streams.IRandomAccessStream]))
$mgrType = [Windows.Media.Control.GlobalSystemMediaTransportControlsSessionManager]
$propsType = [Windows.Media.Control.GlobalSystemMediaTransportControlsSessionMediaProperties]
$manager = Await ($mgrType::RequestAsync()) $mgrType

function Pick-Session {
    $sessions = @($manager.GetSessions())
    $spotify = $sessions | Where-Object { $_.SourceAppUserModelId -like '*Spotify*' } | Select-Object -First 1
    if ($spotify) { return $spotify }
    return $null
}

function Save-Art($props, [string]$path) {
    if ($null -eq $props.Thumbnail) { return $false }
    $stream = Await ($props.Thumbnail.OpenReadAsync()) ([Windows.Storage.Streams.IRandomAccessStreamWithContentType])
    # PowerShell cannot bind WinRT COM objects to .NET overloads, so call the stream bridge via reflection.
    $net = $asStream.Invoke($null, @($stream))
    $src = [System.Drawing.Image]::FromStream($net)
    try {
        # Spotify thumbnails can have letterbox bars; crop to the centered square.
        $side = [Math]::Min($src.Width, $src.Height)
        $bmp = New-Object System.Drawing.Bitmap $ArtSize, $ArtSize
        $g = [System.Drawing.Graphics]::FromImage($bmp)
        $g.InterpolationMode = 'HighQualityBicubic'
        $g.SmoothingMode = 'AntiAlias'
        $g.PixelOffsetMode = 'HighQuality'
        $g.Clear([System.Drawing.Color]::Transparent)
        # Rounded-corner clip so the art matches the glass UI.
        $r = [int]($ArtSize * 0.18)
        $gp = New-Object System.Drawing.Drawing2D.GraphicsPath
        $gp.AddArc(0, 0, $r * 2, $r * 2, 180, 90)
        $gp.AddArc($ArtSize - $r * 2 - 1, 0, $r * 2, $r * 2, 270, 90)
        $gp.AddArc($ArtSize - $r * 2 - 1, $ArtSize - $r * 2 - 1, $r * 2, $r * 2, 0, 90)
        $gp.AddArc(0, $ArtSize - $r * 2 - 1, $r * 2, $r * 2, 90, 90)
        $gp.CloseFigure()
        $g.SetClip($gp)
        $srcRect = New-Object System.Drawing.Rectangle ([int](($src.Width - $side) / 2)), ([int](($src.Height - $side) / 2)), $side, $side
        $dstRect = New-Object System.Drawing.Rectangle 0, 0, $ArtSize, $ArtSize
        $g.DrawImage($src, $dstRect, $srcRect, [System.Drawing.GraphicsUnit]::Pixel)
        $g.Dispose()
        $bmp.Save($path, [System.Drawing.Imaging.ImageFormat]::Png)
        $bmp.Dispose()
    } finally {
        $src.Dispose()
        $net.Dispose()
    }
    return $true
}

function Esc([string]$s) {
    if ($null -eq $s) { return '' }
    return ($s -replace '\\', '\\' -replace '"', '\"' -replace "`r", '' -replace "`n", ' ')
}

$inv = [Globalization.CultureInfo]::InvariantCulture
$lastKey = ''
$artPath = ''
$artIndex = 0

while ($true) {
    if ($ParentPid -gt 0 -and -not (Get-Process -Id $ParentPid -ErrorAction SilentlyContinue)) { break }

    try {
        $session = Pick-Session

        if ($CmdFile -and (Test-Path $CmdFile)) {
            $cmds = Get-Content $CmdFile -ErrorAction SilentlyContinue
            Remove-Item $CmdFile -ErrorAction SilentlyContinue
            if ($session) {
                foreach ($c in $cmds) {
                    switch ($c.Trim()) {
                        'toggle' { Await ($session.TryTogglePlayPauseAsync()) ([bool]) | Out-Null }
                        'next' { Await ($session.TrySkipNextAsync()) ([bool]) | Out-Null }
                        'prev' { Await ($session.TrySkipPreviousAsync()) ([bool]) | Out-Null }
                    }
                }
            }
        }

        if ($null -eq $session) {
            [Console]::Out.WriteLine('{"active":false}')
        } else {
            $props = Await ($session.TryGetMediaPropertiesAsync()) $propsType
            $tl = $session.GetTimelineProperties()
            $pb = $session.GetPlaybackInfo()
            $key = "$($props.Title)|$($props.Artist)"
            if ($key -ne $lastKey) {
                $lastKey = $key
                $artIndex++
                $candidate = Join-Path $ArtDir ("pulse-art-" + $artIndex + ".png")
                try { if (Save-Art $props $candidate) { $artPath = $candidate } else { $artPath = '' } } catch { $artPath = '' }
                Get-ChildItem $ArtDir -Filter 'pulse-art-*.png' -ErrorAction SilentlyContinue |
                    Where-Object { $_.FullName -ne $artPath } | Remove-Item -ErrorAction SilentlyContinue
            }
            $playing = ($pb.PlaybackStatus.ToString() -eq 'Playing')
            $pos = [Math]::Round($tl.Position.TotalSeconds, 2)
            $end = [Math]::Round($tl.EndTime.TotalSeconds, 2)
            $age = [Math]::Round(([DateTimeOffset]::Now - $tl.LastUpdatedTime).TotalSeconds, 2)
            $json = '{"active":true,"title":"' + (Esc $props.Title) + '","artist":"' + (Esc $props.Artist) +
                '","album":"' + (Esc $props.AlbumTitle) + '","playing":' + $playing.ToString().ToLower() +
                ',"position":' + $pos.ToString($inv) + ',"duration":' + $end.ToString($inv) + ',"age":' + $age.ToString($inv) +
                ',"art":"' + (Esc $artPath) + '"}'
            [Console]::Out.WriteLine($json)
        }
        [Console]::Out.Flush()
    } catch {
        [Console]::Out.WriteLine('{"active":false,"error":"' + (Esc $_.Exception.Message) + '"}')
        [Console]::Out.Flush()
    }
    Start-Sleep -Milliseconds 500
}
