# Law Enforcement Spanish — Google Play release guide (native Android)

**Repo:** https://github.com/corbymaupin/law-enforcement-spanish  
**Developer brand:** Applied Solutions Lab  
**Package id:** `com.corbymaupin.lespanish`  
**Price:** **$1.99 one-time** (paid app, no subscription / no IAP)  
**First version:** `versionName 1.0.0` / `versionCode 1`

Native Play code lives in **`android/`** — Kotlin + Jetpack Compose. Open that folder in Android Studio (Sync → Run). See `android/README.md`.

The repo root keeps the **web reference** `index.html` (behavior/content source for vocabulary). **No WebView / TWA / Capacitor / Cordova** — Play ships from the native Compose app only.

---

## Monetization & classmate promo codes

| Item | Plan |
|---|---|
| Base price | **$1.99** USD one-time purchase |
| Subscriptions / IAP | None |
| Classmate / promo access | **Play Console promo codes** (one-time codes for the paid app) — generate under Monetize → Promo codes; share privately with classmates. Codes redeem in Play Store; they do **not** live in the APK. |
| Free trial | Optional via Play Console if desired later; not required for 1.0.0 |

---

## What’s in the native scaffold

| Feature | Status |
|---|---|
| 295 cards / 9 categories from `assets/terms.json` | Done |
| Study: flip card, correct/incorrect, Leitner scheduling | Done |
| Session new-card rotation (~30/70; graduate after 2 correct) | Done |
| Category practice mode (no SRS) | Done |
| Listen mode (hands-free; does not move boxes) | Done |
| Browse deck by category | Done |
| Stats: streak, totals, box gauge | Done |
| Feedback → email `james.corby.maupin@gmail.com` | Done |
| Offline-only runtime after install | Done |
| Privacy policy URL | Host or add `privacy.html` before submit |

---

## Play Console checklist (Corby)

1. Google Play developer account ($25 one-time) under **Applied Solutions Lab** (or personal + brand in listing).
2. Create app → **Paid** → set price **$1.99**.
3. Upload signed `.aab` from Android Studio (Play App Signing).
4. Listing: title **Law Enforcement Spanish**, short/full description, icon, feature graphic, phone screenshots from the **native** UI.
5. Data safety: no data collected / on-device only (progress in DataStore; Feedback uses the user’s email app).
6. Content rating questionnaire; target audience appropriate for LE training tool.
7. Generate **promo codes** for classmates after the paid product is active.
8. Internal testing track → production.

---

## Versioning

| Field | Value (first upload) |
|---|---|
| `versionName` | `1.0.0` |
| `versionCode` | `1` |
| applicationId | `com.corbymaupin.lespanish` |

Bump `versionCode` on every Play upload; bump `versionName` for user-visible releases.

---

## Retired (do not use for Play)

- PWABuilder / Bubblewrap / TWA
- Capacitor / Cordova / PhoneGap / any WebView shell around `index.html`

---

## Next steps after this scaffold

1. Capture store screenshots from a debug/release install.
2. Add/host privacy policy (on-device storage wording).
3. Create upload keystore; enable Play App Signing.
4. Internal test → priced production + promo codes.
