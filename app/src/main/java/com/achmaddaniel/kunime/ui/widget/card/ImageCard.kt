package com.achmaddaniel.kunime.ui.widget.card

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape

import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api

import androidx.compose.runtime.Composable

import androidx.compose.ui.Alignment
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

import coil.compose.AsyncImage

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ImageCard(image: String, onClick: () -> Unit) {
	Card(elevation = CardDefaults.cardElevation(0.dp),
		 shape = RoundedCornerShape(12.dp),
		 onClick = { onClick }) {
		Box(modifier = Modifier.height(220.dp).width(136.dp),
			contentAlignment = Alignment.BottomStart) {
			AsyncImage(
				model = image,
				contentDescription = null,
				contentScale = ContentScale.Crop,
				modifier = Modifier.fillMaxSize()
			) //AsyncImage
		} //Box
	} //Card
}