package com.example.m3tanetscontacts.data.model

data class Contacts(
    val imageResource: Int,
    val imageResource2: Int,
    val name: String,
    val phoneNbr: String,
    val eMail: String,
    val chatHistory: MutableList<String>
)
