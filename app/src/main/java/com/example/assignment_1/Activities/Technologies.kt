package com.example.assignment_1.Activities

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.assignment_1.R

class Technologies : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_technologies)

        val calsup = findViewById<Button>(R.id.navigatebtn)
        calsup.setOnClickListener {
            val intent = Intent(Intent.ACTION_CALL)
            intent.setData(Uri.parse("tel: 9108543903"))
            startActivity(intent)
        }
    }
}