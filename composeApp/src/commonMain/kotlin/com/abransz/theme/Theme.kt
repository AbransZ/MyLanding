package com.abransz.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable


private val DarkColorScheme = darkColorScheme(
    primary = moradoPrimary,
    onPrimary = moradoTextMain,
    secondary = celestAccent,
    onSecondary = moradoTextSecondary,
    tertiary = azulTertiary,
    onTertiary = azulOnTertiary,
    background = Background,
    surface = azulSurface
)

private val LightColorScheme = lightColorScheme(
    primary = moradoPrimaryLight,
    onPrimary = azulOnPrimaryLight,
    secondary = celesteAccentLight,
    onSecondary = azulTextSecondaryLight,
    tertiary = azulTertiaryLight,
    onTertiary = AzulOnTertiaryLight,
    background = BackgroundLight,
    surface = moradoSurfaceLight
)

@Composable
fun ThemeColor(
    darktheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
){
    val colorScheme = if (darktheme) DarkColorScheme else LightColorScheme

    MaterialTheme(
       colorScheme =  colorScheme ,
        content = content
    )
}
