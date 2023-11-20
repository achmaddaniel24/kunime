package com.achmaddaniel.kunime.pages

import com.achmaddaniel.kunime.api.getCurrentUser
import com.achmaddaniel.kunime.model.SplashScreen
import com.achmaddaniel.kunime.ui.theme.Theme

import android.os.Bundle

import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels

import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen

import androidx.compose.foundation.layout.fillMaxSize

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface

import androidx.compose.ui.Modifier

import androidx.navigation.compose.rememberNavController

class MainActivity : ComponentActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		val viewModel : SplashScreen by viewModels()
		installSplashScreen().setKeepOnScreenCondition {
			viewModel.isLoading.value
		}
		setContent {
			Theme {
				Surface(modifier = Modifier.fillMaxSize(),
						color = MaterialTheme.colorScheme.background) {
					val navController = rememberNavController()
					if(getCurrentUser() != null)
						HomePage(navController)
					else
						LoginPage(navController)
				} //Surface
			} //Theme
		} //SetContent
	} //onCreate
}