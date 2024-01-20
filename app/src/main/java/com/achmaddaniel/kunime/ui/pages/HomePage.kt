package com.achmaddaniel.kunime.ui.pages

import com.achmaddaniel.kunime.model.OngoingAnime
import com.achmaddaniel.kunime.ui.theme.Typography
import com.achmaddaniel.kunime.ui.widget.Carousel
import com.achmaddaniel.kunime.ui.widget.SearchView

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding

import androidx.compose.material3.Text

import androidx.compose.runtime.Composable

import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp

import android.widget.Toast

@Composable
fun HomePage() {
	val context = LocalContext.current
	/* TEST */
	val ongoingList = ArrayList<OngoingAnime>()
	ongoingList.add(
		OngoingAnime(
			"Isekai de Mofumofu Nadenade suru Tame ni Ganbattemasu",
			"https://otakudesu.media/wp-content/uploads/2024/01/Isekai-de-Mofumofu-Nadenade-suru-Tame-ni-Ganbattemasu..jpg",
			"Senin, 15 Januari 2024",
			"3"
		)
	)
	ongoingList.add(
		OngoingAnime(
			"Shin no Nakama ja Nai to Yuusha no Party wo Oidasareta node Season 2",
			"https://otakudesu.media/wp-content/uploads/2024/01/shinnonakama-season-2-655e084c1dfffp.jpg",
			"Senin, 15 Januari 2024",
			"2"
		)
	)
	ongoingList.add(
		OngoingAnime(
			"Nanatsu no Taizai: Mokushiroku no Yonkishi",
			"https://otakudesu.media/wp-content/uploads/2023/10/Nanatsu-no-Taizai-Mokushiroku-no-Yonkishi.jpg",
			"Minggu, 14 Januari 2024",
			"13"
		)
	)
	ongoingList.add(
		OngoingAnime(
			"Captain Tsubasa Season 2: Junior Youth-hen",
			"https://otakudesu.media/wp-content/uploads/2023/10/Captain-Tsubasa-Season-2.jpg",
			"Minggu, 14 Januari 2024",
			"15"
		)
	)
	ongoingList.add(
		OngoingAnime(
			"One Piece",
			"https://otakudesu.media/wp-content/uploads/2021/05/One-Piece-Sub-Indo.jpg",
			"Minggu, 14 Januari 2024",
			"1090"
		)
	)
	ongoingList.add(
		OngoingAnime(
			"Kingdom Season 5",
			"https://otakudesu.media/wp-content/uploads/2024/01/Kingdom-Season-5-Subtitle-Indonesia.jpg",
			"Minggu, 14 Januari 2024",
			"1"
		)
	)
	
	Column(modifier = Modifier.fillMaxSize()) {
		Box(modifier = Modifier.fillMaxWidth(),
			contentAlignment = Alignment.TopCenter) {
			SearchView("Cari anime atau movie..")
		} //Box
		Text(text  = "Sedang berlangsung",
			 style = Typography.titleLarge,
			 modifier = Modifier.padding(start = 20.dp, top = 20.dp, end = 20.dp)
		) //Text
		Carousel(content = ongoingList, onClick = {
			Toast.makeText(context, "clicked", Toast.LENGTH_SHORT).show()
		}) //Carousel
	} //Column
}