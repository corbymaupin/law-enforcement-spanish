# Law Enforcement Spanish — local sideload (Corby)

**Package:** `com.corbymaupin.lespanish`  
**Version:** 1.0.0 (versionCode 1)  
**Sideload APK:** GitHub Release **v1.0.0-sideload** → `le-spanish-1.0.0-release-debugsigned.apk`  
(Also built under `/workspace/play-publish/le-spanish/` on the agent box.)

| File | Installable? | Notes |
|---|---|---|
| `le-spanish-1.0.0-release-debugsigned.apk` | **Yes** | Release build signed with the Android **debug** keystore (not for Play). Prefer for sideload. |
| `le-spanish-1.0.0-debug.apk` | **Yes** | Debug-signed; larger. |
| `le-spanish-1.0.0-release-unsigned.apk` | No | Needs signing. |
| `le-spanish-1.0.0-release-unsigned.aab` | No (Play only) | Needs Corby’s upload keystore + Play App Signing. |

## Option A — USB + adb (recommended)

1. On the phone: **Settings → About phone** → tap Build number 7× → enable **Developer options**.
2. Developer options → turn on **USB debugging**.
3. Plug in USB; allow the debugging prompt on the phone.
4. Download the release-debugsigned APK from the GitHub Release, then:

```bash
adb devices
adb install -r le-spanish-1.0.0-release-debugsigned.apk
```

`-r` replaces an existing install of the same package.

## Option B — copy APK to phone

1. Copy the release-debugsigned APK to the phone (Drive, email, USB file transfer).
2. On the phone: open the file → **Install**.
3. If blocked: allow **Install unknown apps** for the file app you used.
4. Open **Law Enforcement Spanish** from the launcher.

## Quick smoke check after install

- Study: flip a card, mark correct/incorrect
- Listen: TTS speaks Spanish
- Browse: 295 cards / categories visible
- Stats: streak/totals render
- Feedback: opens mail draft with subject **LE Spanish feedback** to `james.corby.maupin@gmail.com`

## Uninstall

```bash
adb uninstall com.corbymaupin.lespanish
```

Or long-press the app icon → Uninstall.
