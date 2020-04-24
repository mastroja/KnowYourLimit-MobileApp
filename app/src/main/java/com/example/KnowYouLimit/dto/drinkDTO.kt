package com.example.KnowYouLimit.dto

data class drinkDTO(var name: String, var category: String, var abv: String, var size: String) {

    override fun toString(): String{
        return "$name ($abv) $size"
    }
}