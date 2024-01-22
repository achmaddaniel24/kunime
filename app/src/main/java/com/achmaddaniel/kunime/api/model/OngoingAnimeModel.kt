package com.achmaddaniel.kunime.api.model

import com.achmaddaniel.kunime.api.ClientService
import com.achmaddaniel.kunime.api.response.OngoingAnime
import com.achmaddaniel.kunime.api.response.OngoingAnimeResponse

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

import android.util.Log

class OngoingAnimeModel {
	
	var content: ArrayList<OngoingAnime> = ArrayList<OngoingAnime>()
	
	fun fetch() {
		ClientService.endpoint.getOngoingList().enqueue(object: Callback<OngoingAnimeResponse> {
			override fun onResponse(call: Call<OngoingAnimeResponse>, response: Response<OngoingAnimeResponse>) {
				if(response.isSuccessful) {
					content.addAll(response.body()!!.ongoing)
					Log.i("GET_ONGOING_ANIME", "thumb: ${content}")
				}
			}
			override fun onFailure(call: Call<OngoingAnimeResponse>, t: Throwable) {
				Log.e("GET_ONGOING_ANIME", t.toString())
			}
		})
	}
	
	fun available() : Boolean {
		return content.size > 0
	}
}