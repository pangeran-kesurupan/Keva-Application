package id.antasari.p5datasave_230104040080.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

// =======================
// 🎨 Warna Utama Keva
// =======================
val KevaGreen = Color(0xFF10B981)
val KevaBlue = Color(0xFF3B82F6)
val KevaTeal = Color(0xFF14B8A6)
val KevaOnPrimaryDark = Color(0xFF002116)

// =======================
// 🌞 Light Theme
// =======================
private val LightColors = lightColorScheme(
    primary = KevaGreen,
    onPrimary = Color.White,
    secondary = KevaBlue,
    onSecondary = Color.White,
    tertiary = KevaTeal
    // sisanya biarkan default Material3
)

// =======================
// 🌚 Dark Theme
// =======================
private val DarkColors = darkColorScheme(
    primary = KevaGreen,
    onPrimary = KevaOnPrimaryDark, // kontras di background gelap
    secondary = KevaBlue,
    onSecondary = Color.White,
    tertiary = KevaTeal
)

// =======================
// 🎨 Fungsi Tema Utama
// =======================
@Composable
fun KevaTheme(
    darkTheme: Boolean,
    content: @Composable () -> Unit
) {
    // pilih skema warna sesuai mode
    val scheme = if (darkTheme) DarkColors else LightColors

    MaterialTheme(
        colorScheme = scheme,
        content = content
    )
}
