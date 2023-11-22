package com.achmaddaniel.kunime.ui.widget

import com.achmaddaniel.kunime.common.data.DataVideo

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.rememberLazyListState

import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text

import androidx.compose.runtime.Composable

import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp

import coil.compose.AsyncImage

@Composable
fun Carousel(dataVideo: List<DataVideo>) {
	val scrollState = rememberLazyListState()
	Column(modifier = Modifier.fillMaxSize()) {
		Box(modifier = Modifier.padding(16.dp)) {
			LazyRow(state = scrollState,
					modifier = Modifier.fillMaxWidth(),
					horizontalArrangement = Arrangement.spacedBy(16.dp)) {
				itemsIndexed(dataVideo) { _, model ->
					Card(modifier = Modifier.height(256.dp),
						 elevation = CardDefaults.cardElevation(0.dp)) {
						AsyncImage(
							model = model.thumb,
							contentDescription = "Image",
							contentScale = ContentScale.FillBounds,
							modifier = Modifier.width(144.dp)
						) //AsyncImage
					} //Card
				} //itemsIndexed
			} //LazyRow
		} //Box
	} //Column
}