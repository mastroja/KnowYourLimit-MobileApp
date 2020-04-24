package com.example.KnowYouLimit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import com.example.KnowYouLimit.R.id.beerListView
import android.app.AlertDialog.Builder
import android.content.DialogInterface
import androidx.appcompat.app.AlertDialog

class AddDrinkActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_drink)

        val doneBtn = findViewById<Button>(R.id.doneBtn)
        doneBtn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

                val dialogBuilder = AlertDialog.Builder(this)

                        val listItems = arrayOf("1","2","3")
                        val mbuilder =AlertDialog.Builder(this)
                        mbuilder.setTitle("How Intoxicated are you?")
                        mbuilder.setSingleChoiceItems(listItems, -1) {dialogInterface, i ->

                            dialogInterface.dismiss()
                        }
                        // neutral cancel button
                        mbuilder.setNeutralButton("Cancel"){dialog,which ->
                           dialog.cancel()
                        }
                        val mDialog =mbuilder.create()
                        mDialog.show()
////
                    }






        }
    }

