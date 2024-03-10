package com.example.bloomcompose.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.bloomcompose.R

// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )
    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */
)


val BloomTypography = Typography(
    headlineLarge = TextStyle(
        fontFamily = FontFamily(Font(R.font.nunito_sans_bold, FontWeight.Bold)),
        fontWeight = FontWeight.Bold,
        fontSize = 18.sp,
        letterSpacing = 0.sp
    ),
    headlineMedium = TextStyle(
        fontFamily = FontFamily(Font(R.font.nunito_sans_bold, FontWeight.Bold)),
        fontWeight = FontWeight.Bold,
        fontSize = 14.sp,
        letterSpacing = 0.15.sp
    ),
    titleLarge = TextStyle(
        fontFamily = FontFamily(Font(R.font.nunito_sans_light, FontWeight.Light)),
        fontWeight = FontWeight.Light,
        fontSize = 16.sp,
        letterSpacing = 0.sp
    ),
    bodyLarge = TextStyle(
        fontFamily = FontFamily(Font(R.font.nunito_sans_light, FontWeight.Light)),
        fontWeight = FontWeight.Light,
        fontSize = 14.sp,
        letterSpacing = 0.sp
    ),
    bodyMedium = TextStyle(
        fontFamily = FontFamily(Font(R.font.nunito_sans_light, FontWeight.Light)),
        fontWeight = FontWeight.Light,
        fontSize = 12.sp,
        letterSpacing = 0.sp
    ),
)

val buttonFontStyle = TextStyle(
    fontFamily = FontFamily(Font(R.font.nunito_sans_semibold, FontWeight.SemiBold)),
    fontWeight = FontWeight.SemiBold,
    fontSize = 14.sp,
    letterSpacing = 1.sp
)