package com.achmaddaniel.kunime.api.model

import com.achmaddaniel.kunime.api.ApiServices
import com.achmaddaniel.kunime.api.ongoingToData
import com.achmaddaniel.kunime.common.data.*

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

import android.util.Log

class OngoingAnimeModel {
	
	var res: ArrayList<DataVideo> = ArrayList<DataVideo>()
	
	fun fetch() {
		ApiServices.endpoint.getOngoingList().enqueue(object : Callback<OngoingAnimeResponse> {
			override fun onResponse(call: Call<OngoingAnimeResponse>, response: Response<OngoingAnimeResponse>) {
				if(response.isSuccessful) {
					var responseBody = response.body()?.ongoing
					Log.i("API", "response: ${responseBody}")
					responseBody?.forEach { item ->
						res.add(ongoingToData(item))
						Log.i("API", "-----------------------------------------------------------------------")
						Log.i("API", "item: ${item}")
						Log.i("API", "data: ${ongoingToData(item)}")
						Log.i("API", "result: ${res}")
					}
				}
			}
			override fun onFailure(call: Call<OngoingAnimeResponse>, t: Throwable) {
				Log.e("API", t.toString())
			}
		})
	}
}