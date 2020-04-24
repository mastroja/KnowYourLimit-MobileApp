package com.example.KnowYouLimit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
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

        val listView:ListView = findViewById(R.id.beerListView)
        listView.setAdapter(adapter)

        val doneBtn = findViewById<Button>(R.id.doneBtn)
        doneBtn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
