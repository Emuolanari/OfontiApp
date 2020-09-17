package com.app.ofontiworldwide

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        men.setOnClickListener {
            val intent = Intent(this, MenActivity::class.java)
            startActivity(intent)
        }
    }
}
