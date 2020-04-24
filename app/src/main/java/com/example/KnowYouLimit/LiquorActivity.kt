package com.example.KnowYouLimit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.example.KnowYouLimit.dto.drinkDTO
import android.widget.AdapterView
import android.widget.AdapterView.OnItemClickListener
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import android.view.View

class LiquorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_liquor)

        var whiskey = drinkDTO("Whiskey", "liquor", "40%", "2oz")
        var vodka = drinkDTO("Vodka", "liquor", "40%", "2oz")
        var gin = drinkDTO("Gin", "liquor", "47%", "2oz")
        var rum = drinkDTO("Rum", "liquor", "40%", "2oz")


        var liquorArray = arrayOf(whiskey, vodka, gin, rum)

        val adapter = ArrayAdapter(
            this,
            R.layout.listview_item, liquorArray
        )

        val listView: ListView = findViewById(R.id.liquorListView)
        listView.setAdapter(adapter)

        listView.onItemClickListener =
            AdapterView.OnItemClickListener { parent, view, position, id ->

            fun onItemClick(
                parent: AdapterView<*>, view: View,
                position: Int, id: Long
            ) {

                // value of item that is clicked
                val itemValue = listView.getItemAtPosition(position) as String

                // Toast the values
                Toast.makeText(
                    applicationContext,
                    "Position :$position\nItem Value : $itemValue", Toast.LENGTH_LONG
                )
                Toast.makeText(applicationContext,
                    "Drink added", Toast.LENGTH_LONG)
                    .show()
            }
        }

        val doneBtn = findViewById<Button>(R.id.doneBtn)
        doneBtn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)


                }

        }

    }



