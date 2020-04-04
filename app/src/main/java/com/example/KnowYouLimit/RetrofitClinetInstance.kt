package com.example.KnowYouLimit

//This class creates an instance for you to send an HTTP request to your JSON url and get data back from it.
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClinetInstance {
    private var retrofit: Retrofit? = null
    private val BASE_URL = "https://bottomsup-f3e22.firebaseio.com"

    val retrofitInstance : Retrofit?
        get(){
            // has this drink been created yet
            if(retrofit == null){
            retrofit = retrofit2.Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
            }
            return retrofit
        }
}
