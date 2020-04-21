package com.example.KnowYouLimit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val beerBtn = findViewById<Button>(R.id.beerBtn)
        beerBtn.setOnClickListener {
            val intent = Intent(this, BeerActivity::class.java)
            startActivity(intent)
        }
        val mixedBtn = findViewById<Button>(R.id.mixedDrinkBtn)
        mixedBtn.setOnClickListener {
            val intent = Intent(this, MixedDrinkActivity::class.java)
            startActivity(intent)
        }
        val liquorBtn = findViewById<Button>(R.id.liquorBtn)
        liquorBtn.setOnClickListener {
            val intent = Intent(this, LiquorActivity::class.java)
            startActivity(intent)
        }
    }
}
