package com.achmaddaniel.kunime.ui.widget

import androidx.compose.foundation.text.KeyboardOptions

import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue

import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.ImeAction

@Composable
fun EditText(hint: String, modifier: Modifier) {
	var textInput by remember { mutableStateOf("") }
	OutlinedTextField(
		value = textInput,
		onValueChange = {
			textInput = it
		},
		singleLine = true,
		placeholder = { Text(hint) },
		keyboardOptions = KeyboardOptions.Default.copy(
			imeAction = ImeAction.Done
		),
		modifier = modifier
	)
}