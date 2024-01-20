package com.achmaddaniel.kunime.ui.theme

import com.achmaddaniel.kunime.R

import androidx.compose.material3.Typography

import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.TextStyle

import androidx.compose.ui.unit.sp

val SfPro = FontFamily(
	Font(R.font.sf_pro, FontWeight.Normal),
	Font(R.font.sf_pro_italic, FontWeight.Normal, FontStyle.Italic)
)

val Typography = Typography(
	displayLarge = TextStyle(
		fontFamily = SfPro
	),
	displayMedium = TextStyle(
		fontFamily = SfPro
	),
	displaySmall = TextStyle(
		fontFamily = SfPro
	),
	headlineLarge = TextStyle(
		fontFamily = SfPro
	),
	headlineMedium = TextStyle(
		fontFamily = SfPro
	),
	headlineSmall = TextStyle(
		fontFamily = SfPro
	),
	titleLarge = TextStyle(
		fontFamily = SfPro,
		fontWeight = FontWeight.Bold,
		fontSize = 30.sp
	),
	titleMedium = TextStyle(
		fontFamily = SfPro
	),
	titleSmall = TextStyle(
		fontFamily = SfPro
	),
	bodyLarge = TextStyle(
		fontFamily = SfPro
	),
	bodyMedium = TextStyle(
		fontFamily = SfPro
	),
	bodySmall = TextStyle(
		fontFamily = SfPro
	),
	labelLarge = TextStyle(
		fontFamily = SfPro
	),
	labelMedium = TextStyle(
		fontFamily = SfPro
	),
	labelSmall = TextStyle(
		fontFamily = SfPro
	)
)