package com.achmaddaniel.kunime.pages

import com.achmaddaniel.kunime.common.data.DataVideo
import com.achmaddaniel.kunime.ui.theme.Typography
import com.achmaddaniel.kunime.ui.widget.Carousel
import com.achmaddaniel.kunime.ui.widget.SearchView

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding

import androidx.compose.material3.Text

import androidx.compose.ui.Modifier
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp

import androidx.compose.runtime.Composable

@Composable
fun HomePage() {
	val ongoingList = listOf(
		DataVideo(
			"Hoshikuzu Telepath",
			"https://otakudesu.cam/wp-content/uploads/2023/10/Hoshikuzu-Telepath.jpg"
		),
		DataVideo(
			"Hoshikuzu Telepath",
			"https://otakudesu.cam/wp-content/uploads/2023/10/Hoshikuzu-Telepath.jpg"
		),
		DataVideo(
			"Hoshikuzu Telepath",
			"https://otakudesu.cam/wp-content/uploads/2023/10/Hoshikuzu-Telepath.jpg"
		),
		DataVideo(
			"Hoshikuzu Telepath",
			"https://otakudesu.cam/wp-content/uploads/2023/10/Hoshikuzu-Telepath.jpg"
		),
		DataVideo(
			"Hoshikuzu Telepath",
			"https://otakudesu.cam/wp-content/uploads/2023/10/Hoshikuzu-Telepath.jpg"
		)
	)
	Column {
		Box(modifier = Modifier.fillMaxWidth(),
			contentAlignment = Alignment.TopCenter) {
			SearchView("Cari anime")
		} //Box
		Text(text = "Sedang berlangsung",
			 style = Typography.titleLarge,
			 modifier = Modifier.padding(all = 20.dp)
		) //Text
		Carousel(ongoingList)
	} //Column
}