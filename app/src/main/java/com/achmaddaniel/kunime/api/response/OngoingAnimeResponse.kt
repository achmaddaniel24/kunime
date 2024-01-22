package com.achmaddaniel.kunime.api.response

data class OngoingAnime(
	val title: String,
	val thumb: String,
	val total_episode: String,
	val updated_on: String,
	val updated_day: String,
	val endpoint: String
)

data class OngoingAnimeResponse(
	val status: Boolean,
	val message: String,
	val ongoing: ArrayList<OngoingAnime>
)