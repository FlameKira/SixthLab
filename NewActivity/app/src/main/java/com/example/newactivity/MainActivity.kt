package com.example.newactivity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }
//
        val btnShowPic = findViewById<Button>(R.id.btn_show_pic)

        btnShowPic.setOnClickListener {
            val intent = Intent(this, PicActivity::class.java)
            intent.putExtra("picLink", "https://r4.mt.ru/r24/photo1E82/20989441047-0/jpg/bp.jpeg")
            startActivity(intent)
        }
    }
}