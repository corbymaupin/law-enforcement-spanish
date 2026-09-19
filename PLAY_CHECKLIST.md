# Law Enforcement Spanish — Play readiness checklist

**Repo:** https://github.com/corbymaupin/law-enforcement-spanish  
**Package:** `com.corbymaupin.lespanish`  
**Version kept:** `1.0.0` / versionCode `1` (first local test; not published elsewhere)  
**Price (everywhere):** **$1.99** one-time

## Done (this pass)

- [x] Native Kotlin + Compose app with 295 cards (`assets/terms.json`)
- [x] Study / Listen / Browse / Stats / Feedback
- [x] Feedback mailto subject verified: `LE Spanish feedback` → `james.corby.maupin@gmail.com`
- [x] Pricing docs unified to **$1.99** (README was $3.99; now matches PLAY_RELEASE)
- [x] `privacy.html` (offline / no collection / LE branding) ready for GitHub Pages
- [x] `store-assets/LISTING.md` (title ≤30, short/full description, keywords, $1.99)
- [x] Repo `icons/` (192/512 PNG + SVG, LE blue #3B82F6); existing android mipmaps left intact
- [x] Local build artifacts under `/workspace/play-publish/le-spanish/`
  - Installable: `le-spanish-1.0.0-debug.apk`, `le-spanish-1.0.0-release-debugsigned.apk`
  - Play-shaped but **unsigned**: `le-spanish-1.0.0-release-unsigned.aab` (+ unsigned APK)
- [x] `INSTALL.md` sideload steps
- [x] GitHub Release **v1.0.0-sideload** with release-debugsigned APK
- [x] `INSTALL.md` + `PLAY_CHECKLIST.md` in repo root

## Blocked on Corby (Cortana deliverable blockers)

| Blocker | Why it blocks Play | Owner |
|---|---|---|
| **Upload keystore** | Play needs a properly signed AAB (upload key). Do **not** invent passwords; Corby creates/stores `.jks` once. | Corby |
| **Play Console app creation** | Create paid app under Applied Solutions Lab, set price **$1.99**, enroll Play App Signing | Corby |
| **Privacy URL host** | File is in repo; URL `https://corbymaupin.github.io/law-enforcement-spanish/privacy.html` must resolve (enable GitHub Pages on `main` or host elsewhere) | Corby |
| **Store screenshots + feature graphic** | Console requires phone screenshots (and usually a feature graphic). Capture from debug/release install; Jobsite has a feature-graphic pattern under its `store-assets/` for reference only | Corby / agent later |
| **Content rating + Data safety** | Questionnaire in Console; suggested answers in LISTING.md (no data collected) | Corby |
| **Promo codes** | After paid product is live — classmate access | Corby |

## Explicitly out of scope this stream

- Jobsite Spanish rebuild / dirty tree
- Veterinarian Spanish
- Inventing or committing upload keystore / secrets

## Next minimal path to Play internal test

1. Corby: create upload keystore + keep passwords offline
2. Sign `bundleRelease` (or Studio **Generate Signed Bundle**) → upload AAB
3. Enable GitHub Pages so privacy URL works
4. Paste LISTING.md copy; upload icon from `icons/icon-512.png` + screenshots
5. Internal testing track → production + promo codes
