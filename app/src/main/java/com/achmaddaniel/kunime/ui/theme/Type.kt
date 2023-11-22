package com.achmaddaniel.kunime.ui.theme

import com.achmaddaniel.kunime.R

import androidx.compose.material3.Typography

import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.TextStyle

import androidx.compose.ui.unit.sp

val FiraSans = FontFamily(
	Font(R.font.firasans_light, FontWeight.Light),
	Font(R.font.firasans_regular, FontWeight.Normal),
	Font(R.font.firasans_italic, FontWeight.Normal, FontStyle.Italic),
	Font(R.font.firasans_medium, FontWeight.Medium),
	Font(R.font.firasans_bold, FontWeight.Bold),
	Font(R.font.firasans_semibold, FontWeight.SemiBold)
)

val Typography = Typography(
	displayLarge = TextStyle(
		fontFamily = FiraSans
	),
	displayMedium = TextStyle(
		fontFamily = FiraSans
	),
	displaySmall = TextStyle(
		fontFamily = FiraSans
	),
	headlineLarge = TextStyle(
		fontFamily = FiraSans
	),
	headlineMedium = TextStyle(
		fontFamily = FiraSans
	),
	headlineSmall = TextStyle(
		fontFamily = FiraSans
	),
	titleLarge = TextStyle(
		fontFamily = FiraSans,
		fontWeight = FontWeight.Bold,
		fontSize = 30.sp
	),
	titleMedium = TextStyle(
		fontFamily = FiraSans
	),
	titleSmall = TextStyle(
		fontFamily = FiraSans
	),
	bodyLarge = TextStyle(
		fontFamily = FiraSans
	),
	bodyMedium = TextStyle(
		fontFamily = FiraSans
	),
	bodySmall = TextStyle(
		fontFamily = FiraSans
	),
	labelLarge = TextStyle(
		fontFamily = FiraSans
	),
	labelMedium = TextStyle(
		fontFamily = FiraSans
	),
	labelSmall = TextStyle(
		fontFamily = FiraSans
	)
)