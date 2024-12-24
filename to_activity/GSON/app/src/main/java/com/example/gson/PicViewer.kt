package com.example.gson

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide


class PicViewer : AppCompatActivity() {

    lateinit var picLink: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pic_viewer)

        picLink = intent.getStringExtra("picLink").toString()

        val picView: ImageView = findViewById(R.id.picView)

        Glide.with(picView)
            .load(picLink)
            .into(picView)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.action_favorite) {
            val intent = Intent()
            intent.putExtra("picLink", picLink)
            intent.putExtra("info", "Картинка добавлена в избранное")
            setResult(RESULT_OK, intent)
            finish()
            return true
        }
        return super.onOptionsItemSelected(item)
    }


}