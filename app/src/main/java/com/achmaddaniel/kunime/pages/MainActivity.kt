package com.achmaddaniel.kunime.pages

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
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

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
					HomePage()
				} //Surface
			} //Theme
		} //SetContent
	} //onCreate
}

@Composable
fun Navigator(navController: NavHostController) {
	NavHost(navController = navController,
			startDestination = "") {
		composable("home_page") {
			HomePage()
		}
		composable("info_page") {
			InfoPage(navController)
		}
	} //NavHost
}