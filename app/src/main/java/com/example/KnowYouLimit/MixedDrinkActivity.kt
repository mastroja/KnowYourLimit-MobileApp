package com.example.KnowYouLimit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.example.KnowYouLimit.dto.drinkDTO

class MixedDrinkActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mixed)

        var marg = drinkDTO("Margarita", "mixed", "26%", "12oz")
        var oldFashioned = drinkDTO("Old Fashioned", "mixed", "35%", "6oz")
        var mojito = drinkDTO("Mojito", "mixed", "25%", "8oz")
        var moscowMule = drinkDTO("Moscow Mule", "mixed", "35%", "8oz")
        var vodkaRedbull = drinkDTO("Vodka & Redbull", "mixed", "30%", "8oz")

        var mixedArray = arrayOf(marg, oldFashioned, mojito, moscowMule, vodkaRedbull)

        val adapter = ArrayAdapter(
            this,
            R.layout.listview_item, mixedArray
        )

        val listView: ListView = findViewById(R.id.mixedView)
        listView.setAdapter(adapter)
        listView.onItemClickListener =
            AdapterView.OnItemClickListener { parent, view, position, id ->
                // value of item that is clicked
                //val itemValue = listView.getItemAtPosition(position) as String
                Toast.makeText(
                    applicationContext,
                    "Drink added", Toast.LENGTH_LONG
                )
                    .show()

                val doneBtn = findViewById<Button>(R.id.doneBtn)
                doneBtn.setOnClickListener {
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)


                }

            }
    }
}
