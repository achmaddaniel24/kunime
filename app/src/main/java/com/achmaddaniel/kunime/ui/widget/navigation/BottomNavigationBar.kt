package com.achmaddaniel.kunime.ui.widget.navigation

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue

@Composable
fun BottomNavigationBar(barItems: ArrayList<BottomNavigationItem>) {
	var selectedItem by remember { mutableStateOf(0) }
	NavigationBar {
		barItems.forEachIndexed { index, item ->
			NavigationBarItem(
				selected = selectedItem == index,
				onClick = {
					selectedItem = index
					/* navigate to selected route */
				},
				icon = {
					Icon(
						imageVector = if(selectedItem == index) item.selectedIcon else item.unselectedIcon,
						contentDescription = item.title
					) //Icon
				},
				label = {
					Text(text = item.title)
				},
				alwaysShowLabel = selectedItem == index
			) //NavigationBarItem
		} //forEachIndexed
	} //NavigationBar
}