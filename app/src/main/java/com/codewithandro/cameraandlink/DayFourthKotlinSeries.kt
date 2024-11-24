package com.codewithandro.cameraandlink

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DayFourthKotlinSeries : AppCompatActivity() {


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_day_fourth_kotlin_series)


        val cameraBtn = findViewById<ImageView>(R.id.cameraBtn)
        val webBtn = findViewById<ImageView>(R.id.webBtn)

        //camera  Intent
        cameraBtn.setOnClickListener{
            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(intent)
        }

        //web intent
        webBtn.setOnClickListener{
            Toast.makeText(applicationContext,"Opennig Linkdin Url",Toast.LENGTH_LONG).show()
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.linkedin.com/in/prajwal-jaybhaye")
            startActivity(intent)
        }

    }
}