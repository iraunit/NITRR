package com.shyptsolution.nitrr.faculties

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.shyptsolution.nitrr.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_wholeinfo.*

class Wholeinfo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wholeinfo)

        var image=findViewById<ImageView>(R.id.departimage)
        var name=findViewById<TextView>(R.id.depname)
        var welcome=findViewById<TextView>(R.id.welcome)
        var mission=findViewById<TextView>(R.id.mission)
        var HOD=findViewById<TextView>(R.id.HOD)
        var faculty1=findViewById<TextView>(R.id.faculty1)
        var faculty2=findViewById<TextView>(R.id.faculty2)
        var staff1=findViewById<TextView>(R.id.staff1)
        var staff2=findViewById<TextView>(R.id.staff2)







        val actionbar = supportActionBar
        actionbar!!.title = "Department Info"
        actionbar.setDisplayHomeAsUpEnabled(true)

        val bundle= intent.extras
        val nameid: String?= bundle!!.getString("namee")
        var welcomeid:String?=bundle!!.getString("dept")
        var imageurl:String?=bundle!!.getString("image")
        val visiionid: String?= bundle!!.getString("vision")
        val missionid: String?= bundle!!.getString("mission")
        val HODid: String?= bundle!!.getString("HOD")
        val fac1id: String?= bundle!!.getString("fac1")
        val fac2id: String?= bundle!!.getString("fac2")
        val fac3id: String?= bundle!!.getString("fac3")
        val staff1id: String?= bundle!!.getString("staff1")
        val staff2id: String?= bundle!!.getString("staff2")

        name.text=nameid
        welcome.text=welcomeid
        Picasso.get().load(imageurl).into(image)
        mission.text=missionid
        vision.text=visiionid
        HOD.text=HODid
        faculty1.text=fac1id
        faculty2.text=fac2id
        faculty3.text=fac3id
        staff1.text=staff1id
        staff2.text=staff2id
        








    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}