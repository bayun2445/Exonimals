package com.example.exonimals

data class Animal(
    var name: String = "",
    var classification: String = "",
    var latinName: String = "",
    var habitat: String = "",
    var diet: String = "",
    var description: String = "",
    var photo: Int = 0,
    var isFavorite: Boolean = false
)
