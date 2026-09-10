# Law Enforcement Spanish — native Android (Kotlin + Jetpack Compose)

**Package id:** `com.corbymaupin.lespanish`  
(Chosen over `com.corbymaupin.lawenforcementspanish` for a shorter, cleaner applicationId.)  
**Developer brand:** Applied Solutions Lab  
**No WebView / Capacitor / Cordova / TWA** — pure Compose UI.

## Open in Android Studio

1. Open Android Studio → **File → Open** → select this `android/` folder (not the repo root).
2. Let Gradle Sync finish (SDK 35 / JDK 17 recommended).
3. Run on an emulator or device (minSdk 26).

Android Studio will write `local.properties` with your `sdk.dir`.

## Command-line debug build

```bash
cd android
./gradlew assembleDebug
```

APK output: `app/build/outputs/apk/debug/app-debug.apk`

## What’s included

- `app/src/main/assets/terms.json` — 295 cards exported from the web `SEED_TERMS` (`id` = `en|es`)
- Study / Listen / Browse / Stats / Feedback bottom navigation
- Leitner SRS + session rotation (~30/70 new/review, graduate after 2 correct)
- DataStore progress + Android `TextToSpeech` for Spanish
- Feedback screen opens mailto: `james.corby.maupin@gmail.com`

Web reference files at the repo root (`index.html`) are untouched.
