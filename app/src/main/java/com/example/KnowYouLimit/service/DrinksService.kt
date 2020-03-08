package com.example.KnowYouLimit.service

import androidx.lifecycle.MutableLiveData
import com.example.KnowYouLimit.dto.drinks

class DrinksService {
    fun fetchDrinks(name: String): MutableLiveData<ArrayList<drinks>> {
        return MutableLiveData<ArrayList<drinks>>()
    }
}