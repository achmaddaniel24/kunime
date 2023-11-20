package com.achmaddaniel.kunime.pages

import com.achmaddaniel.kunime.R
import com.achmaddaniel.kunime.ui.theme.Typography
import com.achmaddaniel.kunime.ui.widget.EditText

import androidx.compose.foundation.background
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding

import androidx.compose.material3.Button
import androidx.compose.material3.Text

import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

import androidx.compose.runtime.Composable

import androidx.navigation.NavHostController

@Composable
fun LoginPage(navController: NavHostController) {
	Column {
		Image(
			painter = painterResource(id = R.drawable.kunime),
			contentDescription = "Kunime Icon",
			modifier = Modifier.padding(all = 56.dp)
		) //Image
		Text(text = "Login",
			 style = Typography.titleLarge,
			 modifier = Modifier.padding(all = 16.dp)
		) //Text
		EditText(hint = "Email",
				 modifier = Modifier.fillMaxWidth()
									.padding(start = 16.dp, end = 16.dp, bottom = 16.dp)
		) //EditText
		EditText(hint = "Password",
				 modifier = Modifier.fillMaxWidth()
									.padding(start = 16.dp, end = 16.dp, bottom = 16.dp)
		) //EditText
		Button(
			onClick = {
			},
			modifier = Modifier.fillMaxWidth()
							   .padding(start = 16.dp, end = 16.dp)) {
			Text(text = "Sign in")
		} //Button
	} //Column
}