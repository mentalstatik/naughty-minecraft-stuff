# PULSE SCANNER ("Radium") — decompiled source of the sanitized build

**What this is.** Java source recovered from `radium-crack-sanitized.jar`
(SHA-256 `a4de283e03c0f46e255a74d0565112b982f8ffc5cf3f8a04b1391189430bc22f`, 258 classes),
itself produced from `radium-crack-silentnet-removed.jar`. Decompiler output, not the
author's sources: obfuscator names, reconstructed locals and generics.

**Tooling.** Vineflower 1.10.1 (`-dgs=1 -rsy=1`) over the whole jar, static. 122 of the 258
files contain methods Vineflower could not render (irreducible CFGs from the SilentNet
opaque predicates); those files were re-rendered with CFR 0.152 and carry a
`Decompiled with CFR 0.152` header. Nothing was executed.

**State of this source (already sanitized).** Relative to the original jar, these are gone
in the code you are reading:

- `native0/**` (the three identical Windows DLLs and `Loader`) and `assets/lqelijny.tmp`.
- All 97 `native` methods across 10 classes are stubs returning `null` / `0` / `false`,
  and the 12 `native0/Loader.registerNativesForClass` / `Hidden0.special_clinit_*` calls
  are gone, so no class tries to resolve the removed package.
- `pulsescanner.f.e.b.a(String,double,int,String)` — the Discord webhook sender — is an
  empty method, and its `HttpClient` field is stored as `null`.
- `pulsescanner.e.a.a(int)` — the PowerShell launcher for the media bridge — is empty, and
  `assets/pulsescanner/media/media.ps1` is no longer in the jar.

**Still in the source.**

- Most literals live in a `String[]` decrypted in each class's `<clinit>` (XOR with a
  per-blob key and a rotated 7-entry table). They are therefore written as `a[12]` here;
  the readable values are recoverable statically (see `work/radium2/tools/DecodeStrings.java`).
- `pulsescanner/license/*` and `pulsescanner/b/a` are SilentNet-backed: their real bodies
  were native, so the stubs in this tree are all that exists. Licence checks, settings
  persistence and identity checks are therefore inert.
- Licence panel strings, the "Webhook URL" / "Discord ID" settings and the `PulseDiag
  sessionKey` log lines remain as dead UI/text.

**Limitations.** Not verified to compile: it references Minecraft by intermediary names
(`class_310`, `method_1551`, ...), so Fabric Loom plus 1.21.11 mappings are required, and no
`build.gradle` exists because the original project files were never in the jar.
