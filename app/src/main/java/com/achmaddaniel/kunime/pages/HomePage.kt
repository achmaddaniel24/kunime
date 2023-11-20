package com.achmaddaniel.kunime.pages

import com.achmaddaniel.kunime.ui.theme.Typography
import com.achmaddaniel.kunime.ui.widget.SearchView

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding

import androidx.compose.material3.Text
import androidx.compose.material3.Typography

import androidx.compose.ui.Modifier
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp

import androidx.compose.runtime.Composable

@Composable
fun HomePage() {
	Column {
		Box(modifier = Modifier.fillMaxWidth(),
			contentAlignment = Alignment.TopCenter) {
			SearchView("Search anime")
		} //Box
		Text(text = "Today",
			 style = Typography.titleLarge,
			 modifier = Modifier.padding(all = 20.dp)
		) //Text
		Row {
		}
	} //Column
}