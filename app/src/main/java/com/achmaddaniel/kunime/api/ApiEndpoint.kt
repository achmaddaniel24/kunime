package com.achmaddaniel.kunime.api

import com.achmaddaniel.kunime.common.data.*

import retrofit2.Call
import retrofit2.http.GET

interface ApiEndpoint {
	
	@GET("ongoing/1")
	fun getOngoingList(): Call<OngoingAnimeResponse>
}