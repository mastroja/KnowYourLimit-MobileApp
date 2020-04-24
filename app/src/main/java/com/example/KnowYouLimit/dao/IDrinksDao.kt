package com.example.KnowYouLimit.dao

import com.example.KnowYouLimit.dto.drinkDTO
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface IDrinksDao {

    @GET("")
    fun getAllDrinks(): Call<ArrayList<drinkDTO>>

    @GET("")
    fun getDrinks(@Query("Combined_Name") name: String) : Call<ArrayList<drinkDTO>>
}