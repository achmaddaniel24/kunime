package com.achmaddaniel.kunime.ui

import com.achmaddaniel.kunime.ui.pages.HomePage
import com.achmaddaniel.kunime.ui.theme.Theme

import com.achmaddaniel.kunime.ui.widget.navigation.BottomNavigationBar
import com.achmaddaniel.kunime.ui.widget.navigation.BottomNavigationItem

import android.os.Bundle

import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.safeDrawingPadding

import androidx.compose.material3.Scaffold
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Settings

class MainActivity : ComponentActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContent {
			Theme {
				Surface(modifier = Modifier.fillMaxSize().safeDrawingPadding(),
						color = MaterialTheme.colorScheme.background) {
					Scaffold(bottomBar = { BottomNavigationBar(bottomNavItem()) }) { _ ->
						HomePage()
					} //Scaffold
				} //Surface
			} //Theme
		} //SetContent
	} //onCreate
}

fun bottomNavItem() : ArrayList<BottomNavigationItem> {
	val items = ArrayList<BottomNavigationItem>()
	items.add(
		BottomNavigationItem(
			title = "Beranda",
			selectedIcon = Icons.Filled.Home,
			unselectedIcon = Icons.Outlined.Home,
			route = "home"
		)
	)
	items.add(
		BottomNavigationItem(
			title = "Pengaturan",
			selectedIcon = Icons.Filled.Settings,
			unselectedIcon = Icons.Outlined.Settings,
			route = "setting"
		)
	)
	return items
}