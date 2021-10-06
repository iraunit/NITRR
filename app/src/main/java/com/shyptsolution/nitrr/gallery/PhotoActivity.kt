package com.shyptsolution.nitrr.gallery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.ActionBar
import com.shyptsolution.nitrr.R
import com.squareup.picasso.Picasso

class PhotoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_photo)
//        var image=intent.getStringExtra("imageee")
        var gallerylar=findViewById<ImageView>(R.id.gallerylarge)
        val bundle= intent.extras
        val resId = bundle!!.getString("image")
        Picasso.get().load(resId).into(gallerylar)
        val actionbar = supportActionBar
        //set actionbar title
        actionbar!!.title = "Gallery"
        //set back button
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)

    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}


