package com.achmaddaniel.kunime.pages

import androidx.compose.runtime.Composable

import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

/**
 *  List Composable:
 *  MainPage.kt			-> home_page
 *  LoginPage.kt		-> login_page
 *  MovieInfoPage.kt	-> movie_info_page
 *  RegisterPage.kt		-> register_page
 */

@Composable
fun Navigator(navController: NavHostController) {
	NavHost(navController = navController,
			startDestination = "") {
		composable("home_page") {
			HomePage(navController)
		}
		composable("login_page") {
			LoginPage(navController)
		}
		composable("movie_info_page") {
			MovieInfoPage(navController)
		}
		composable("register_page") {
			RegisterPage(navController)
		}
	}
}