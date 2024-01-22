package com.achmaddaniel.kunime.ui.pages

import com.achmaddaniel.kunime.api.model.OngoingAnimeModel
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
import android.util.Log

@Composable
fun HomePage() {
	Log.i("HOME_PAGE", "HELLO WORLD")
	
	var context = LocalContext.current
	var ongoingAnimeList = ArrayList<String>()
	val models = OngoingAnimeModel()
	models.fetch()
	Log.i("HOME_PAGE", "content: ${models.content}")
	models.content.forEach { model ->
		ongoingAnimeList.add(model.thumb)
		Log.i("HOME_PAGE", "thumb: ${model.thumb}")
	}
	
	Column(modifier = Modifier.fillMaxSize()) {
		Box(modifier = Modifier.fillMaxWidth(),
			contentAlignment = Alignment.TopCenter) {
			SearchView("Cari anime atau movie..")
		} //Box
		Text(text  = "Sedang berlangsung",
			 style = Typography.titleLarge,
			 modifier = Modifier.padding(start = 20.dp, top = 20.dp, end = 20.dp)
		) //Text
		Carousel(images = getOngoingListTest(), onClick = {
			Toast.makeText(context, "clicked", Toast.LENGTH_SHORT).show()
		}) //Carousel
	} //Column
}

fun getOngoingListTest() : ArrayList<String> {
	Log.i("HOME_PAGE", "HELLO WORLD TEST")
	var ongoingList = ArrayList<String>()
	ongoingList.add("https://otakudesu.media/wp-content/uploads/2024/01/Bucchigiri-Subtitle-Indonesia.jpg")
	ongoingList.add("https://otakudesu.media/wp-content/uploads/2024/01/shinnonakama-season-2-655e084c1dfffp.jpg")
	ongoingList.add("https://otakudesu.media/wp-content/uploads/2023/10/Nanatsu-no-Taizai-Mokushiroku-no-Yonkishi.jpg")
	ongoingList.add("https://otakudesu.media/wp-content/uploads/2023/10/Captain-Tsubasa-Season-2.jpg")
	ongoingList.add("https://otakudesu.media/wp-content/uploads/2021/05/One-Piece-Sub-Indo.jpg")
	ongoingList.add("https://otakudesu.media/wp-content/uploads/2024/01/Kingdom-Season-5-Subtitle-Indonesia.jpg")
	return ongoingList
}