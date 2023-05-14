package com.example.assignment_1.Activities

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView
import com.example.assignment_1.R
import com.example.assignment_1.Activities.AndroidDevelopment

class Technologies : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_technologies)

        val androiddev = findViewById<CardView>(R.id.androiddev)
        androiddev.setOnClickListener {
            val intent = Intent(this, AndroidDevelopment::class.java)
            startActivity(intent)
        }

        val webdev = findViewById<CardView>(R.id.webdev)
        webdev.setOnClickListener {
            val intent = Intent(this, WebDevelopment::class.java)
            startActivity(intent)
        }

        val iosdev = findViewById<CardView>(R.id.iosdev)
        iosdev.setOnClickListener {
            val intent = Intent(this, IosDevelopment::class.java)
            startActivity(intent)
        }

        val ml = findViewById<CardView>(R.id.ml)
        ml.setOnClickListener {
            val intent = Intent(this, MachineLearning::class.java)
            startActivity(intent)
        }

        val bigdata = findViewById<CardView>(R.id.bigdata)
        bigdata.setOnClickListener {
            val intent = Intent(this, BigData::class.java)
            startActivity(intent)
        }

        val ai = findViewById<CardView>(R.id.ai)
        ai.setOnClickListener {
            val intent = Intent(this, ArtificialIntelligence::class.java)
            startActivity(intent)
        }

        val calsup = findViewById<Button>(R.id.callsupport)
        calsup.setOnClickListener {
            val intent = Intent(Intent.ACTION_CALL)
            intent.data = Uri.parse("tel:"+"9108543903")
            startActivity(intent)
        }
    }
}