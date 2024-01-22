package com.achmaddaniel.kunime.ui.widget

import com.achmaddaniel.kunime.ui.widget.card.ImageCard

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.rememberLazyListState

import androidx.compose.runtime.Composable

import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Carousel(images: ArrayList<String>, onClick: () -> Unit) {
	Column(modifier = Modifier.fillMaxSize()) {
		Box(modifier = Modifier.padding(22.dp)) {
			LazyRow(state = rememberLazyListState(),
					modifier = Modifier.fillMaxWidth(),
					horizontalArrangement = Arrangement.spacedBy(16.dp)) {
				itemsIndexed(images) { _, image ->
					ImageCard(image, onClick)
				} //itemsIndexed
			} //LazyRow
		} //Box
	} //Column
}