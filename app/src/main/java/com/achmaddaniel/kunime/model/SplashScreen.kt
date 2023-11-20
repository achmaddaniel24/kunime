package com.achmaddaniel.kunime.model

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashScreen : ViewModel() {
	
	private val mutableStateFlow = MutableStateFlow(true)
	val isLoading = mutableStateFlow.asStateFlow()
	
	init {
		viewModelScope.launch {
			delay(2000) //2 second
			mutableStateFlow.value = false
		} //viewModelScope.launch
	} //init
}