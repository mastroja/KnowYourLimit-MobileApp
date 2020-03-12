package com.example.KnowYouLimit.ui.main

import androidx.lifecycle.MutableLiveData
import com.example.KnowYouLimit.dto.drinks
import com.example.KnowYouLimit.service.DrinksService

class MainViewModel {
    var drinks: MutableLiveData<ArrayList<drinks>> = MutableLiveData()
    var drinksService : DrinksService = DrinksService()

    fun fetchDrinks(name: String){
        drinks = drinksService.fetchDrinks(name)
    }
}