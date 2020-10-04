package com.example.KnowYouLimit.service

import androidx.lifecycle.MutableLiveData
import com.example.KnowYouLimit.dto.drinkDTO

class DrinksService {
    fun fetchDrinks(name: String): MutableLiveData<ArrayList<drinkDTO>> {
        return MutableLiveData<ArrayList<drinkDTO>>()
    }
}