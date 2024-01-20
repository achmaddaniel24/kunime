package com.achmaddaniel.kunime.api

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiServices {
	
	var base = "https://otakudesu-anime-api.vercel.app/api/v1/"
	val endpoint: ApiEndpoint get() {
		var retrofit = Retrofit.Builder()
			.baseUrl(base)
			.client(client)
			.addConverterFactory(GsonConverterFactory.create())
			.build()
		return retrofit.create(ApiEndpoint::class.java)
	}
	
	private val client: OkHttpClient get() {
		var interceptor = HttpLoggingInterceptor()
		interceptor.level = HttpLoggingInterceptor.Level.BODY
		return OkHttpClient.Builder().addInterceptor(interceptor).build()
	}
}