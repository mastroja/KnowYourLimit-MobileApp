package com.example.KnowYouLimit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import com.example.KnowYouLimit.R.id.beerListView
import com.example.KnowYouLimit.dto.drinkDTO

class BeerActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_beer)

        var budlight = drinkDTO("Bud light", "beer", "4.2%", "12oz")
        var budlightPlat = drinkDTO("Bud Light Platinum", "beer", "6%", "12oz")
        var coorLight = drinkDTO("Coors Light", "beer", "4.2%", "12oz")
        var hamms = drinkDTO("Hamm's", "beer", "4.7%", "12oz")
        var heineken = drinkDTO("Heineken", "beer", "5%", "12oz")
        var michelob = drinkDTO("Michelob Ultra", "beer", "4.2%", "12oz")
        var millerHighLife = drinkDTO("Miller High Life", "beer", "4.6%", "12oz")
        var rollingRock = drinkDTO("Rolling Rock", "beer", "4.5%", "12oz")
        var stella = drinkDTO("Stella Artois", "beer", "5.2%", "12oz")
        var yuengling = drinkDTO("Yuengling", "beer", "4.5%", "12oz")

        var beerArray = arrayOf(budlight, budlightPlat, coorLight, hamms, heineken, michelob, millerHighLife, rollingRock, stella, yuengling)

        val adapter = ArrayAdapter(this,
            R.layout.listview_item, beerArray)

        val listView:ListView = findViewById(beerListView)
        listView.adapter = adapter

//        listView.onItemClickListener =
//            AdapterView.OnItemClickListener { parent, view, position, id ->
//                // value of item that is clicked
//                val itemValue = listView.getItemAtPosition(position) as String
//
//                // Toast the values
//                Toast.makeText(applicationContext,
//                    "Drink added", Toast.LENGTH_LONG)
//                    .show()
//            }

        val doneBtn = findViewById<Button>(R.id.doneBtn)
        doneBtn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
