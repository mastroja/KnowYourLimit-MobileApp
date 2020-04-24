package com.example.KnowYouLimit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val b10 = findViewById<Button>(R.id.popupBtn10)
        val b9 = findViewById<Button>(R.id.popupBtn9)
        val b8 = findViewById<Button>(R.id.popupBtn8)
        val b7 = findViewById<Button>(R.id.popupBtn7)
        val b6 = findViewById<Button>(R.id.popupBtn6)
        val b5 = findViewById<Button>(R.id.popupBtn5)
        val b4 = findViewById<Button>(R.id.popupBtn4)
        val b3 = findViewById<Button>(R.id.popupBtn3)
        val b2 = findViewById<Button>(R.id.popupBtn2)
        val b1 = findViewById<Button>(R.id.popupBtn1)
        val overlay = findViewById<ImageView>(R.id.popupOverlay)
        val area = findViewById<ImageView>(R.id.popupArea)
        val text = findViewById<TextView>(R.id.popupTxt)

        b1.setOnClickListener {
            fun showHide(view: View) {
                view.visibility = if (view.visibility == View.VISIBLE) {
                    View.INVISIBLE
                } else {
                    View.VISIBLE
                }

            }
        }
        b2.setOnClickListener {
            fun showHide(view: View) {
                view.visibility = if (view.visibility == View.VISIBLE) {
                    View.INVISIBLE
                } else {
                    View.VISIBLE
                }

            }
        }
        b3.setOnClickListener {
            fun showHide(view: View) {
                view.visibility = if (view.visibility == View.VISIBLE) {
                    View.INVISIBLE
                } else {
                    View.VISIBLE
                }

            }
        }
        b4.setOnClickListener {
            fun showHide(view: View) {
                view.visibility = if (view.visibility == View.VISIBLE) {
                    View.INVISIBLE
                } else {
                    View.VISIBLE
                }

            }
        }
        b5.setOnClickListener {
            fun showHide(view: View) {
                view.visibility = if (view.visibility == View.VISIBLE) {
                    View.INVISIBLE
                } else {
                    View.VISIBLE
                }

            }
        }
        b6.setOnClickListener {
            fun showHide(view: View) {
                view.visibility = if (view.visibility == View.VISIBLE) {
                    View.INVISIBLE
                } else {
                    View.VISIBLE
                }

            }
        }
        b7.setOnClickListener {
            fun showHide(view: View) {
                view.visibility = if (view.visibility == View.VISIBLE) {
                    View.INVISIBLE
                } else {
                    View.VISIBLE
                }

            }
        }
        b8.setOnClickListener {
            fun showHide(view: View) {
                view.visibility = if (view.visibility == View.VISIBLE) {
                    View.INVISIBLE
                } else {
                    View.VISIBLE
                }

            }
        }
        b9.setOnClickListener {
            fun showHide(view: View) {
                view.visibility = if (view.visibility == View.VISIBLE) {
                    View.INVISIBLE
                } else {
                    View.VISIBLE
                }

            }
        }
        b10.setOnClickListener {
            fun showHide(view: View) {
                view.visibility = if (view.visibility == View.VISIBLE) {
                    View.INVISIBLE
                } else {
                    View.VISIBLE
                }

            }
        }
        overlay.setOnClickListener {
            fun showHide(view: View) {
                view.visibility = if (view.visibility == View.VISIBLE) {
                    View.INVISIBLE
                } else {
                    View.VISIBLE
                }

            }
        }

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

