package com.shyptsolution.nitrr.faculties

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.shyptsolution.nitrr.R

class Wholeinfo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wholeinfo)

        val actionbar = supportActionBar
        actionbar!!.title = "Department Info"
        actionbar.setDisplayHomeAsUpEnabled(true)


    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}