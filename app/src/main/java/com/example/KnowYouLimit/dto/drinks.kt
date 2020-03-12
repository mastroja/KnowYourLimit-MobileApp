package com.example.KnowYouLimit.dto

data class drinks(var name: String, var category: String, var abv: String, var size: String) {

    override fun toString(): String{
        return "$name $category $abv $size"
    }
}