package com.example.KnowYouLimit.dao

import com.example.KnowYouLimit.dto.drinks
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface IDrinksDao {

    @GET("")
    fun getAllDrinks(): Call<ArrayList<drinks>>

    @GET("")
    fun getDrinks(@Query("Combined_Name") name: String) : Call<ArrayList<drinks>>
}