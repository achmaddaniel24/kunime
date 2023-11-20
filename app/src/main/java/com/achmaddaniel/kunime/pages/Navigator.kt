package com.achmaddaniel.kunime.pages

import androidx.compose.runtime.Composable

import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

/**
 *  List Composable:
 *  MainPage.kt			-> home_page
 *  MovieInfoPage.kt	-> movie_info_page
 */

@Composable
fun Navigator(navController: NavHostController) {
	NavHost(navController = navController,
			startDestination = "") {
		composable("home_page") {
			HomePage()
		}
		composable("movie_info_page") {
			MovieInfoPage(navController)
		}
	}
}