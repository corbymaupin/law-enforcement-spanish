package com.corbymaupin.lespanish.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

val LEBg = Color(0xFF0B0D10)
val LESurface = Color(0xFF14171C)
val LECard = Color(0xFF1B1F26)
val LEAccent = Color(0xFF3B82F6)
val LEAccentDim = Color(0xFF1D4ED8)
val LEBad = Color(0xFFEF4444)
val LEMuted = Color(0xFF9AA3AF)
val LEText = Color(0xFFF5F6F8)

private val DarkColors = darkColorScheme(
    primary = LEAccent,
    onPrimary = Color.White,
    secondary = LEAccentDim,
    background = LEBg,
    onBackground = LEText,
    surface = LESurface,
    onSurface = LEText,
    surfaceVariant = LECard,
    onSurfaceVariant = LEMuted,
    error = LEBad,
    onError = Color.White
)

@Composable
fun LEAppTheme(content: @Composable () -> Unit) {
    // Always dark — matches web #0b0d10 vibe
    MaterialTheme(
        colorScheme = DarkColors,
        content = content
    )
}
