package com.achmaddaniel.kunime.ui.widget

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Search

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.SearchBar
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.ListItem

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchView(hint: String = "Search") {
	var query by remember { mutableStateOf("") }
	var active by remember { mutableStateOf(false) }
	SearchBar(
		query = query,
		onQueryChange = {
			query = it
		},
		onSearch = {
		},
		active = active,
		onActiveChange = {
			active = it
		},
		placeholder = { Text(hint) },
		//textStyle = MaterialTheme.typography.body1,
		leadingIcon = {
			Icon(
				imageVector = Icons.Default.Search,
				contentDescription = "search"
			)
		},
		trailingIcon = {
			if(active) {
				IconButton(
					onClick = {
						if(query.isNotEmpty())
							query = ""
						else
							active = false
					}) {
					Icon(
						imageVector = Icons.Default.Close,
						contentDescription = "close"
					)
				} // IconButton
			} // if active
		}) {
		// TODO:
	} //SearchBar
}