# Echo-side source, SilentNet removed

Everything Echo-related that exists in `echo-client-cracked.jar`, with the
`net.fabric` payload deleted. Same jar as before
(SHA-256 `36e122da299e95ecec0186035a98c3c13f1c5aab4959bbb644a055b9034f20bb`).

## Included

| file | origin | what it is |
|---|---|---|
| `dev/jadyen/drm/echo/loader/KnotEntryPoint.java` | jar (`preLaunch`/`main` entrypoint) | Echo's own loader/DRM shell: extends `SecureClassLoader`, declares JNI `loadClass`/`findClass`/`getResource(s)`, extracts `echonative.dll` to a temp dir and `System.load()`s it |
| `dev/jadyen/mirage/loader/MirageStreamHandler.java` | **recovered from `echonative.dll`** | `URLStreamHandler` that serves in-memory bytes (`ByteArrayInputStream`) — Echo's "Mirage" resource provider. This class was not in the jar at all |
| `echo/offline/config/LocalConfigStore.java` | jar | offline profile store (`profiles.json`, lock, atomic write, 32 MB cap) |
| `echo/offline/config/LocalConfigs.java` | jar | static wrapper over the store |
| `echo/offline/mixin/ShutdownRenderMixin.java` | jar | GLFW shutdown-yield mixin |
| `echo-offline-shutdown.mixins.json` | jar | mixin config |
| `fabric.mod.json` | jar, edited | **only change:** the `net.fabric.aqXjytdffRpHvt` `main` entrypoint is gone; Echo's own `preLaunch`/`main` entries kept |

## Excluded

- **`net/fabric/*`** — the whole SilentNet payload (8 classes). Nothing of Echo's
  was in that package.
- **`assets/gxumjsci.cfg`** — 983,040 bytes, entropy 7.9998, 61,440/61,440 unique
  AES blocks. Not decryptable statically: it is sealed with a key from the Rust
  side's `x25519 agreement` / `server_public_key` / `server_nonce` handshake, and
  the guessing pass over every constant in the jar and DLL (`0123456789abcdef`,
  the `640c89e9-…` GUID, `Echo`, `echoloader`, `TeslaPro`, `echo-offline-session`,
  plus MD5/SHA-256 derivations; ECB/CBC/CFB/OFB/CTR) produced no plaintext.
  Whatever client classes this holds cannot be read without the licence server.
- **`echonative.dll`** — the native client itself. Compiled Rust, ~14.8 MB, only
  `JNI_OnLoad`/`JNI_Unload` exported; build paths point at
  `MonoEcho\.crust-stage-echonative\crates\ui`. There is no source here to
  recover — the client's modules, renderer and GUI live in this binary, not in
  Java.
- `META-INF/MANIFEST.MF` (named `net.fabric.wqHlMe` as `Main-Class`).

## What this means

This is the complete Echo-side Java available from this distribution: a loader, a
resource handler, an offline config store and one mixin — about 460 lines. It is
not a client. The features people install Echo for (modules, HUD, render) are in
the native library and the encrypted cfg, so "Echo source without SilentNet" is
bounded by that: the malware is fully removable, the client itself was never
source in this artefact.

`KnotEntryPoint` will throw without `echonative.dll` beside it — it is kept
because it is Echo's code, not SilentNet's, and it is what the class in this tree
documents. Nothing was executed, and no network code exists anywhere in this tree.

Decompiler output, not original source: intermediary Minecraft names
(`class_310`), reconstructed generics/lambdas, needs Fabric Loom + 1.21.11
mappings to build.
