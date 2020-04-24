package com.example.KnowYouLimit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import com.example.KnowYouLimit.dto.drinkDTO

class LiquorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_liquor)

        var whiskey = drinkDTO("Whiskey", "liquor", "40%", "2oz")
        var vodka = drinkDTO("Vodka", "liquor", "40%", "2oz")
        var gin = drinkDTO("Gin", "liquor", "47%", "2oz")
        var rum = drinkDTO("Rum", "liquor", "40%", "2oz")


        var liquorArray = arrayOf(whiskey, vodka, gin, rum)

        val adapter = ArrayAdapter(this,
            R.layout.listview_item, liquorArray)

        val listView: ListView = findViewById(R.id.liquorListView)
        listView.setAdapter(adapter)

        val doneBtn = findViewById<Button>(R.id.doneBtn)
        doneBtn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }
}
