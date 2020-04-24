package com.example.KnowYouLimit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.RadioButton
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


//        val overlay = findViewById<ImageView>(R.id.popupOverlay)
//        val area = findViewById<ImageView>(R.id.popupArea)
//        val text = findViewById<TextView>(R.id.popupTxt)
//        val a10 = findViewById<ImageView>(R.id.arrow10)
//        val a9 = findViewById<ImageView>(R.id.arrow9)
//        val a8 = findViewById<ImageView>(R.id.arrow8)
//        val a7 = findViewById<ImageView>(R.id.arrow7)
//        val a6 = findViewById<ImageView>(R.id.arrow6)
//        val a5 = findViewById<ImageView>(R.id.arrow5)
//        val a4 = findViewById<ImageView>(R.id.arrow4)
//        val a3 = findViewById<ImageView>(R.id.arrow3)
//        val a2 = findViewById<ImageView>(R.id.arrow2)
//        val a1 = findViewById<ImageView>(R.id.arrow1)
//
//        b1.setOnClickListener {
//            fun showHide(view: View) {
//                view.visibility = if (view.visibility == View.VISIBLE) {
//                    View.INVISIBLE
//                } else {
//                    View.VISIBLE
//                }
//
//            }
//        }
//        b2.setOnClickListener {
//            fun showHide(view: View) {
//                view.visibility = if (view.visibility == View.VISIBLE) {
//                    View.INVISIBLE
//                } else {
//                    View.VISIBLE
//                }
//
//            }
//        }
//        b3.setOnClickListener {
//            fun showHide(view: View) {
//                view.visibility = if (view.visibility == View.VISIBLE) {
//                    View.INVISIBLE
//                } else {
//                    View.VISIBLE
//                }
//
//            }
//        }
//        b4.setOnClickListener {
//            fun showHide(view: View) {
//                view.visibility = if (view.visibility == View.VISIBLE) {
//                    View.INVISIBLE
//                } else {
//                    View.VISIBLE
//                }
//
//            }
//        }
//        b5.setOnClickListener {
//            fun showHide(view: View) {
//                view.visibility = if (view.visibility == View.VISIBLE) {
//                    View.INVISIBLE
//                } else {
//                    View.VISIBLE
//                }
//
//            }
//        }
//        b6.setOnClickListener {
//            fun showHide(view: View) {
//                view.visibility = if (view.visibility == View.VISIBLE) {
//                    View.INVISIBLE
//                } else {
//                    View.VISIBLE
//                }
//
//            }
//        }
//        b7.setOnClickListener {
//            fun showHide(view: View) {
//                view.visibility = if (view.visibility == View.VISIBLE) {
//                    View.INVISIBLE
//                } else {
//                    View.VISIBLE
//                }
//
//            }
//        }
//        b8.setOnClickListener {
//            fun showHide(view: View) {
//                view.visibility = if (view.visibility == View.VISIBLE) {
//                    View.INVISIBLE
//                } else {
//                    View.VISIBLE
//                }
//
//            }
//        }
//        b9.setOnClickListener {
//            fun showHide(view: View) {
//                view.visibility = if (view.visibility == View.VISIBLE) {
//                    View.INVISIBLE
//                } else {
//                    View.VISIBLE
//                }
//
//            }
//        }
//        b10.setOnClickListener {
//            fun showHide(view: View) {
//                view.visibility = if (view.visibility == View.VISIBLE) {
//                    View.INVISIBLE
//                } else {
//                    View.VISIBLE
//                }
//
//            }
//        }
//        overlay.setOnClickListener {
//            fun showHide(view: View) {
//                view.visibility = if (view.visibility == View.VISIBLE) {
//                    View.INVISIBLE
//                } else {
//                    View.VISIBLE
//                }
//
//            }
//        }

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

    fun onRadioButtonClicked(view: View) {if (view is RadioButton) {
        // Is the button now checked?
        val checked = view.isChecked

        // Check which radio button was clicked
        when (view.getId()) {
            R.id.radio1->
                if (checked) {
                    arrow1.visibility = View.VISIBLE
                    arrow2.visibility = View.INVISIBLE
                    arrow3.visibility = View.INVISIBLE
                    arrow4.visibility = View.INVISIBLE
                    arrow5.visibility = View.INVISIBLE
                    arrow6.visibility = View.INVISIBLE
                    arrow7.visibility = View.INVISIBLE
                    arrow8.visibility = View.INVISIBLE
                    arrow9.visibility = View.INVISIBLE
                    arrow10.visibility = View.INVISIBLE
                    popupArea.visibility = View.INVISIBLE
                    popupOverlay.visibility = View.INVISIBLE
                    popupTxt.visibility = View.INVISIBLE
                    beerBtn.visibility = View.VISIBLE
                    mixedDrinkBtn.visibility = View.VISIBLE
                    liquorBtn.visibility = View.VISIBLE
                    radio1.visibility = View.INVISIBLE
                    radio2.visibility = View.INVISIBLE
                    radio3.visibility = View.INVISIBLE
                    radio4.visibility = View.INVISIBLE
                    radio5.visibility = View.INVISIBLE
                    radio6.visibility = View.INVISIBLE
                    radio7.visibility = View.INVISIBLE
                    radio8.visibility = View.INVISIBLE
                    radio9.visibility = View.INVISIBLE
                    radio10.visibility = View.INVISIBLE
                }
            R.id.radio2 ->
                if (checked) {
                    arrow1.visibility = View.INVISIBLE
                    arrow2.visibility = View.VISIBLE
                    arrow3.visibility = View.INVISIBLE
                    arrow4.visibility = View.INVISIBLE
                    arrow5.visibility = View.INVISIBLE
                    arrow6.visibility = View.INVISIBLE
                    arrow7.visibility = View.INVISIBLE
                    arrow8.visibility = View.INVISIBLE
                    arrow9.visibility = View.INVISIBLE
                    arrow10.visibility = View.INVISIBLE
                    popupArea.visibility = View.INVISIBLE
                    popupOverlay.visibility = View.INVISIBLE
                    popupTxt.visibility = View.INVISIBLE
                    beerBtn.visibility = View.VISIBLE
                    mixedDrinkBtn.visibility = View.VISIBLE
                    liquorBtn.visibility = View.VISIBLE
                    radio1.visibility = View.INVISIBLE
                    radio2.visibility = View.INVISIBLE
                    radio3.visibility = View.INVISIBLE
                    radio4.visibility = View.INVISIBLE
                    radio5.visibility = View.INVISIBLE
                    radio6.visibility = View.INVISIBLE
                    radio7.visibility = View.INVISIBLE
                    radio8.visibility = View.INVISIBLE
                    radio9.visibility = View.INVISIBLE
                    radio10.visibility = View.INVISIBLE
                }
            R.id.radio3->
                if (checked) {
                    arrow1.visibility = View.INVISIBLE
                    arrow2.visibility = View.INVISIBLE
                    arrow3.visibility = View.VISIBLE
                    arrow4.visibility = View.INVISIBLE
                    arrow5.visibility = View.INVISIBLE
                    arrow6.visibility = View.INVISIBLE
                    arrow7.visibility = View.INVISIBLE
                    arrow8.visibility = View.INVISIBLE
                    arrow9.visibility = View.INVISIBLE
                    arrow10.visibility = View.INVISIBLE
                    popupArea.visibility = View.INVISIBLE
                    popupOverlay.visibility = View.INVISIBLE
                    popupTxt.visibility = View.INVISIBLE
                    beerBtn.visibility = View.VISIBLE
                    mixedDrinkBtn.visibility = View.VISIBLE
                    liquorBtn.visibility = View.VISIBLE
                    radio1.visibility = View.INVISIBLE
                    radio2.visibility = View.INVISIBLE
                    radio3.visibility = View.INVISIBLE
                    radio4.visibility = View.INVISIBLE
                    radio5.visibility = View.INVISIBLE
                    radio6.visibility = View.INVISIBLE
                    radio7.visibility = View.INVISIBLE
                    radio8.visibility = View.INVISIBLE
                    radio9.visibility = View.INVISIBLE
                    radio10.visibility = View.INVISIBLE
                }
            R.id.radio4 ->
                if (checked) {
                    arrow1.visibility = View.INVISIBLE
                    arrow2.visibility = View.INVISIBLE
                    arrow3.visibility = View.INVISIBLE
                    arrow4.visibility = View.VISIBLE
                    arrow5.visibility = View.INVISIBLE
                    arrow6.visibility = View.INVISIBLE
                    arrow7.visibility = View.INVISIBLE
                    arrow8.visibility = View.INVISIBLE
                    arrow9.visibility = View.INVISIBLE
                    arrow10.visibility = View.INVISIBLE
                    popupArea.visibility = View.INVISIBLE
                    popupOverlay.visibility = View.INVISIBLE
                    popupTxt.visibility = View.INVISIBLE
                    beerBtn.visibility = View.VISIBLE
                    mixedDrinkBtn.visibility = View.VISIBLE
                    liquorBtn.visibility = View.VISIBLE
                    radio1.visibility = View.INVISIBLE
                    radio2.visibility = View.INVISIBLE
                    radio3.visibility = View.INVISIBLE
                    radio4.visibility = View.INVISIBLE
                    radio5.visibility = View.INVISIBLE
                    radio6.visibility = View.INVISIBLE
                    radio7.visibility = View.INVISIBLE
                    radio8.visibility = View.INVISIBLE
                    radio9.visibility = View.INVISIBLE
                    radio10.visibility = View.INVISIBLE
                }
            R.id.radio5->
                if (checked) {
                    arrow1.visibility = View.INVISIBLE
                    arrow2.visibility = View.INVISIBLE
                    arrow3.visibility = View.INVISIBLE
                    arrow4.visibility = View.INVISIBLE
                    arrow5.visibility = View.VISIBLE
                    arrow6.visibility = View.INVISIBLE
                    arrow7.visibility = View.INVISIBLE
                    arrow8.visibility = View.INVISIBLE
                    arrow9.visibility = View.INVISIBLE
                    arrow10.visibility = View.VISIBLE
                    popupArea.visibility = View.INVISIBLE
                    popupOverlay.visibility = View.INVISIBLE
                    popupTxt.visibility = View.INVISIBLE
                    beerBtn.visibility = View.VISIBLE
                    mixedDrinkBtn.visibility = View.VISIBLE
                    liquorBtn.visibility = View.VISIBLE
                    radio1.visibility = View.INVISIBLE
                    radio2.visibility = View.INVISIBLE
                    radio3.visibility = View.INVISIBLE
                    radio4.visibility = View.INVISIBLE
                    radio5.visibility = View.INVISIBLE
                    radio6.visibility = View.INVISIBLE
                    radio7.visibility = View.INVISIBLE
                    radio8.visibility = View.INVISIBLE
                    radio9.visibility = View.INVISIBLE
                    radio10.visibility = View.INVISIBLE
                }
            R.id.radio6 ->
                if (checked) {
                    arrow1.visibility = View.INVISIBLE
                    arrow2.visibility = View.INVISIBLE
                    arrow3.visibility = View.INVISIBLE
                    arrow4.visibility = View.INVISIBLE
                    arrow5.visibility = View.INVISIBLE
                    arrow6.visibility = View.VISIBLE
                    arrow7.visibility = View.INVISIBLE
                    arrow8.visibility = View.INVISIBLE
                    arrow9.visibility = View.INVISIBLE
                    arrow10.visibility = View.INVISIBLE
                    popupArea.visibility = View.INVISIBLE
                    popupOverlay.visibility = View.INVISIBLE
                    popupTxt.visibility = View.INVISIBLE
                    beerBtn.visibility = View.VISIBLE
                    mixedDrinkBtn.visibility = View.VISIBLE
                    liquorBtn.visibility = View.VISIBLE
                    radio1.visibility = View.INVISIBLE
                    radio2.visibility = View.INVISIBLE
                    radio3.visibility = View.INVISIBLE
                    radio4.visibility = View.INVISIBLE
                    radio5.visibility = View.INVISIBLE
                    radio6.visibility = View.INVISIBLE
                    radio7.visibility = View.INVISIBLE
                    radio8.visibility = View.INVISIBLE
                    radio9.visibility = View.INVISIBLE
                    radio10.visibility = View.INVISIBLE
                }
            R.id.radio7->
                if (checked) {
                    arrow1.visibility = View.INVISIBLE
                    arrow2.visibility = View.INVISIBLE
                    arrow3.visibility = View.INVISIBLE
                    arrow4.visibility = View.INVISIBLE
                    arrow5.visibility = View.INVISIBLE
                    arrow6.visibility = View.INVISIBLE
                    arrow7.visibility = View.VISIBLE
                    arrow8.visibility = View.INVISIBLE
                    arrow9.visibility = View.INVISIBLE
                    arrow10.visibility = View.INVISIBLE
                    popupArea.visibility = View.INVISIBLE
                    popupOverlay.visibility = View.INVISIBLE
                    popupTxt.visibility = View.INVISIBLE
                    beerBtn.visibility = View.VISIBLE
                    mixedDrinkBtn.visibility = View.VISIBLE
                    liquorBtn.visibility = View.VISIBLE
                    radio1.visibility = View.INVISIBLE
                    radio2.visibility = View.INVISIBLE
                    radio3.visibility = View.INVISIBLE
                    radio4.visibility = View.INVISIBLE
                    radio5.visibility = View.INVISIBLE
                    radio6.visibility = View.INVISIBLE
                    radio7.visibility = View.INVISIBLE
                    radio8.visibility = View.INVISIBLE
                    radio9.visibility = View.INVISIBLE
                    radio10.visibility = View.INVISIBLE
                }
            R.id.radio8 ->
                if (checked) {
                    arrow1.visibility = View.INVISIBLE
                    arrow2.visibility = View.INVISIBLE
                    arrow3.visibility = View.INVISIBLE
                    arrow4.visibility = View.INVISIBLE
                    arrow5.visibility = View.INVISIBLE
                    arrow6.visibility = View.INVISIBLE
                    arrow7.visibility = View.INVISIBLE
                    arrow8.visibility = View.VISIBLE
                    arrow9.visibility = View.INVISIBLE
                    arrow10.visibility = View.INVISIBLE
                    popupArea.visibility = View.INVISIBLE
                    popupOverlay.visibility = View.INVISIBLE
                    popupTxt.visibility = View.INVISIBLE
                    beerBtn.visibility = View.VISIBLE
                    mixedDrinkBtn.visibility = View.VISIBLE
                    liquorBtn.visibility = View.VISIBLE
                    radio1.visibility = View.INVISIBLE
                    radio2.visibility = View.INVISIBLE
                    radio3.visibility = View.INVISIBLE
                    radio4.visibility = View.INVISIBLE
                    radio5.visibility = View.INVISIBLE
                    radio6.visibility = View.INVISIBLE
                    radio7.visibility = View.INVISIBLE
                    radio8.visibility = View.INVISIBLE
                    radio9.visibility = View.INVISIBLE
                    radio10.visibility = View.INVISIBLE
                }
            R.id.radio9->
                if (checked) {
                    arrow1.visibility = View.INVISIBLE
                    arrow2.visibility = View.INVISIBLE
                    arrow3.visibility = View.INVISIBLE
                    arrow4.visibility = View.INVISIBLE
                    arrow5.visibility = View.INVISIBLE
                    arrow6.visibility = View.INVISIBLE
                    arrow7.visibility = View.INVISIBLE
                    arrow8.visibility = View.INVISIBLE
                    arrow9.visibility = View.VISIBLE
                    arrow10.visibility = View.INVISIBLE
                    popupArea.visibility = View.INVISIBLE
                    popupOverlay.visibility = View.INVISIBLE
                    popupTxt.visibility = View.INVISIBLE
                    beerBtn.visibility = View.VISIBLE
                    mixedDrinkBtn.visibility = View.VISIBLE
                    liquorBtn.visibility = View.VISIBLE
                    radio1.visibility = View.INVISIBLE
                    radio2.visibility = View.INVISIBLE
                    radio3.visibility = View.INVISIBLE
                    radio4.visibility = View.INVISIBLE
                    radio5.visibility = View.INVISIBLE
                    radio6.visibility = View.INVISIBLE
                    radio7.visibility = View.INVISIBLE
                    radio8.visibility = View.INVISIBLE
                    radio9.visibility = View.INVISIBLE
                    radio10.visibility = View.INVISIBLE
                }
            R.id.radio10 ->
                if (checked) {
                    arrow1.visibility = View.INVISIBLE
                    arrow2.visibility = View.INVISIBLE
                    arrow3.visibility = View.INVISIBLE
                    arrow4.visibility = View.INVISIBLE
                    arrow5.visibility = View.INVISIBLE
                    arrow6.visibility = View.INVISIBLE
                    arrow7.visibility = View.INVISIBLE
                    arrow8.visibility = View.INVISIBLE
                    arrow9.visibility = View.INVISIBLE
                    arrow10.visibility = View.VISIBLE
                    popupArea.visibility = View.INVISIBLE
                    popupOverlay.visibility = View.INVISIBLE
                    popupTxt.visibility = View.INVISIBLE
                    beerBtn.visibility = View.VISIBLE
                    mixedDrinkBtn.visibility = View.VISIBLE
                    liquorBtn.visibility = View.VISIBLE
                    radio1.visibility = View.INVISIBLE
                    radio2.visibility = View.INVISIBLE
                    radio3.visibility = View.INVISIBLE
                    radio4.visibility = View.INVISIBLE
                    radio5.visibility = View.INVISIBLE
                    radio6.visibility = View.INVISIBLE
                    radio7.visibility = View.INVISIBLE
                    radio8.visibility = View.INVISIBLE
                    radio9.visibility = View.INVISIBLE
                    radio10.visibility = View.INVISIBLE
                }
        }
    }}
}

