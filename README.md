# Law Enforcement Spanish

Spanish vocabulary and phrase trainer for police officers, county jail officers,
and law enforcement personnel working with Spanish-speaking detainees during
intake, booking, and in-facility interactions.

**Developer:** Applied Solutions Lab  
**Play package id:** `com.corbymaupin.lespanish` (see `android/README.md`)  
**Price (planned):** $3.99 one-time — classmate access via Play Console promo codes  
**Version:** 1.0.0

## Native Android (Play)

Production path is the Kotlin + Jetpack Compose app under **`android/`**.  
No WebView / TWA / Capacitor. Open `android/` in Android Studio, or:

```bash
cd android && ./gradlew assembleDebug
```

Features: Leitner SRS Study, Listen (TTS), Browse, Stats, Feedback email.  
Vocabulary: 295 cards across Intake, Medical, Rights, Commands, Facility,
De-escalation, Questions, Paperwork, Phrases — loaded from
`android/app/src/main/assets/terms.json` (exported from web `SEED_TERMS`).

Release notes: [`PLAY_RELEASE.md`](PLAY_RELEASE.md).

## Web reference

`index.html` is the original single-file PWA/demo used as behavior and content
reference. Keep it; do not wrap it for Play.

## License / contact

Feedback: james.corby.maupin@gmail.com
