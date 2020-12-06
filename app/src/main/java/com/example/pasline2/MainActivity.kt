package com.example.pasline2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btn_simple_intent.setOnClickListener {
            val simpleIntent = Intent(this@MainActivity, SimpleActivity::class.java)
            startActivity(simpleIntent)
        }

        btn_intent_with_data.setOnClickListener {
            val dataIntent = Intent(this@MainActivity, ExplicitIntentActivity::class.java)
            dataIntent.putExtra(ExplicitIntentActivity.EXTRA_NAME, value:"Mega Krismiyati")
            dataIntent.putExtra(ExplicitIntentActivity.EXTRA_AGE, value:"22 Tahun")
            dataIntent.putExtra(ExplicitIntentActivity.EXTRA_EMAIL, value:"megakrismiyati@gmail.com")
            startActivity(dataIntent)
        }
    }
}