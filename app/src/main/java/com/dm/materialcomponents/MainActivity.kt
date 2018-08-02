package com.dm.materialcomponents

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textInputActivity.setOnClickListener {
            startActivity(Intent(this, TextInputActivity::class.java))
        }
        tabActivity.setOnClickListener { startActivity(Intent(this, TabActivity::class.java)) }
        buttonActivity.setOnClickListener {
            startActivity(Intent(this, ButtonActivity::class.java))
        }
        bottomAppBarActivity.setOnClickListener {
            startActivity(Intent(this, BottomAppBarActivity::class.java))
        }
        cardActivity.setOnClickListener {
            startActivity(Intent(this, CardActivity::class.java))
        }
        floatingActionButtonActivity.setOnClickListener {
            startActivity(Intent(this, FloatingActionButtonActivity::class.java))
        }
        chipActivity.setOnClickListener {
            startActivity(Intent(this, ChipActivity::class.java))
        }
        bottomNavigationActivity.setOnClickListener {
            startActivity(Intent(this, BottomNavigationActivity::class.java))
        }
    }
}
