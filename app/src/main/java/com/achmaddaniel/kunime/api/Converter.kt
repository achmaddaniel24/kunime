package com.achmaddaniel.kunime.api

import com.achmaddaniel.kunime.common.data.*

fun ongoingToData(ongoingData: OngoingAnime) : DataVideo {
	return DataVideo(ongoingData.title, ongoingData.thumb)
}