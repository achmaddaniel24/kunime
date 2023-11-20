package com.achmaddaniel.kunime.api

import com.google.firebase.auth.auth
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser

import com.google.firebase.Firebase

fun getCurrentUser() : FirebaseUser? {
	return FirebaseAuth.getInstance().currentUser
}

fun getCurrentUsername() : String? {
	return FirebaseAuth.getInstance().currentUser?.uid
}