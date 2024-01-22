package com.achmaddaniel.kunime.api

import com.achmaddaniel.kunime.api.response.*

import retrofit2.Call
import retrofit2.http.GET

interface Endpoint {
	
	@GET("ongoing/1")
	fun getOngoingList(): Call<OngoingAnimeResponse>
}