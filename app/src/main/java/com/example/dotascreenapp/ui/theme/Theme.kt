package com.example.dotascreenapp.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.PlatformTextStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.unit.sp


private val DarkColorScheme = darkColorScheme(
    primary = Purple80,
    secondary = PurpleGrey80,
    tertiary = Pink80
)

private val LightColorScheme = lightColorScheme(
    primary = Purple40,
    secondary = PurpleGrey40,
    tertiary = Pink40
)

@Composable
fun DotaScreenAppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }
    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            window.statusBarColor = Color.Transparent.toArgb()
            window.navigationBarColor = Color.Transparent.toArgb()
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = darkTheme
        }
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}

object DotaAppTheme {
    object BgColors {
        val background
            @Composable
            get() = BackgroundDarkBlue
        val box
            @Composable
            get() = LogoBoxBlack
        val border
            @Composable
            get() = BorderGray
    }
    object DividerColors {
        val divider
            @Composable
            get() = DividerColor
    }
    object ChipColor {
        val background
            @Composable
            get() = ChipBlueColor
    }
    object ButtonColor{
        val buttonbg
            @Composable
            get() = ContainerButtonColor
    }
    object TextColor {
        val primary
            @Composable
            get() = Color.White
        val maintext
            @Composable
            get() = MainTextColor
        val reviewratings
            @Composable
            get() = ReviewRatingsTextColor
        val reviewstext
            @Composable
            get() = ReviewsTextColor
        val date
            @Composable
            get() = DateTextColor
        val comment
            @Composable
            get() = CommentTextColor
        val button
            @Composable
            get() = ButtonTextColor
        val chip
            @Composable
            get() = ChipTextColor
        val ratingheader
            @Composable
            get() = BackgroundRatingTextColor
    }
    object TextStyle {
        val Bold_48
            @Composable
            get() =
                TextStyle(
                    fontFamily = ModernistFont,
                    fontWeight = FontWeight.Bold,
                    fontSize = 48.sp,
                    platformStyle = PlatformTextStyle(includeFontPadding = false),
                    lineHeightStyle = LineHeightStyle(
                        LineHeightStyle.Alignment.Proportional,
                        LineHeightStyle.Trim.None,
                    ),
                )
        val Bold_20_26
            @Composable
            get() =
                TextStyle(
                    fontFamily = ModernistFont,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    lineHeight = 26.sp,
                    platformStyle = PlatformTextStyle(includeFontPadding = false),
                    lineHeightStyle = LineHeightStyle(
                        LineHeightStyle.Alignment.Proportional,
                        LineHeightStyle.Trim.None,
                    ),
                )
        val Regular_12
            @Composable
            get() =
                TextStyle(
                    fontFamily = ModernistFont,
                    fontWeight = FontWeight.Normal,
                    fontSize = 12.sp,
                    platformStyle = PlatformTextStyle(includeFontPadding = false),
                    lineHeightStyle = LineHeightStyle(
                        LineHeightStyle.Alignment.Proportional,
                        LineHeightStyle.Trim.None,
                    ),
                )
        val Regular_10
            @Composable
            get() =
                TextStyle(
                    fontFamily = ModernistFont,
                    fontWeight = FontWeight.Normal,
                    fontSize = 10.sp,
                    platformStyle = PlatformTextStyle(includeFontPadding = false),
                    lineHeightStyle = LineHeightStyle(
                        LineHeightStyle.Alignment.Proportional,
                        LineHeightStyle.Trim.None,
                    ),
                )
        val Regular_12_19
            @Composable
            get() =
                TextStyle(
                    fontFamily = ModernistFont,
                    fontWeight = FontWeight.Normal,
                    fontSize = 12.sp,
                    lineHeight = 26.sp,
                    platformStyle = PlatformTextStyle(includeFontPadding = false),
                    lineHeightStyle = LineHeightStyle(
                        LineHeightStyle.Alignment.Proportional,
                        LineHeightStyle.Trim.None,
                    ),
                )
        val Bold_16
            @Composable
            get() =
                TextStyle(
                    fontFamily = ModernistFont,
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp,
                    platformStyle = PlatformTextStyle(includeFontPadding = false),
                    lineHeightStyle = LineHeightStyle(
                        LineHeightStyle.Alignment.Proportional,
                        LineHeightStyle.Trim.None,
                    ),
                )
        val Regular_16
            @Composable
            get() =
                TextStyle(
                    fontFamily = ModernistFont,
                    fontWeight = FontWeight.Normal,
                    fontSize = 16.sp,
                    platformStyle = PlatformTextStyle(includeFontPadding = false),
                    lineHeightStyle = LineHeightStyle(
                        LineHeightStyle.Alignment.Proportional,
                        LineHeightStyle.Trim.None,
                    ),
                )
        val Regular_12_20
            @Composable
            get() =
                TextStyle(
                    fontFamily = ModernistFont,
                    fontWeight = FontWeight.Normal,
                    fontSize = 12.sp,
                    lineHeight = 20.sp,
                    letterSpacing = 0.5.sp,
                    platformStyle = PlatformTextStyle(includeFontPadding = false),
                    lineHeightStyle = LineHeightStyle(
                        LineHeightStyle.Alignment.Proportional,
                        LineHeightStyle.Trim.None,
                    ),
                )
        val Bold_20
            @Composable
            get() =
                TextStyle(
                    fontFamily = ModernistFont,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    platformStyle = PlatformTextStyle(includeFontPadding = false),
                    lineHeightStyle = LineHeightStyle(
                        LineHeightStyle.Alignment.Proportional,
                        LineHeightStyle.Trim.None,
                    ),
                )
        val Mono_10
            @Composable
            get() =
                TextStyle(
                    fontFamily = Montserrat,
                    fontWeight = FontWeight.Medium,
                    fontSize = 10.sp,
                    platformStyle = PlatformTextStyle(includeFontPadding = false),
                    lineHeightStyle = LineHeightStyle(
                        LineHeightStyle.Alignment.Proportional,
                        LineHeightStyle.Trim.None,
                    ),
                )
    }
}