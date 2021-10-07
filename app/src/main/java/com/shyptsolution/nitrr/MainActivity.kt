package com.shyptsolution.nitrr

import android.Manifest
import android.content.Context
import android.content.pm.PackageManager
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Adapter
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import com.shyptsolution.nitrr.admission.Admissionfragment
import com.shyptsolution.nitrr.archive.ArchiveFragment
import com.shyptsolution.nitrr.department.Department
import com.shyptsolution.nitrr.department.DepartmentData
import com.shyptsolution.nitrr.gallery.Gallery
import kotlinx.android.synthetic.main.activity_main.*
import android.os.Vibrator
import android.view.WindowManager
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat


class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar!!.hide()

        Toast.makeText(this,"Developed By Raunit Verma", Toast.LENGTH_LONG).show()

//        Snackbar.make(
//            findViewById(R.id.layoutlin),
//            "Hello",
//            Snackbar.LENGTH_SHORT
//        ).show()


        if (Build.VERSION.SDK_INT >= 21) {
            val window = this.window
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
            window.statusBarColor = this.resources.getColor(R.color.royalblue)
        }

        val vibe = this.getSystemService(Context.VIBRATOR_SERVICE) as Vibrator

        var bottomNavigationView=findViewById<BottomNavigationView>(R.id.bottomnavigationview)
        bottomnavigationview.background=null
        bottomnavigationview.menu.getItem(2).isEnabled=false
        var firstFragment=HomeFragment()
        var deptfragment= Department()
        var gallery=Gallery()
        var archive=ArchiveFragment()
        var adm=Admissionfragment()
        var fab:View= findViewById<FloatingActionButton>(R.id.floatingicon)
        fab.setOnClickListener {
            setCurrentFragment(firstFragment)
            vibe.vibrate(30)
        }

        vibe.vibrate(10)
        setCurrentFragment(firstFragment)
        bottomNavigationView.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.people-> {
                    setCurrentFragment(deptfragment)
                    vibe.vibrate(15)
                }
                R.id.home-> {
//                    setCurrentFragment(secondFragment)
                }
                R.id.archive-> {
                    setCurrentFragment(archive)
                    vibe.vibrate(15)
                }
                R.id.money->{
                    setCurrentFragment(adm)
                    vibe.vibrate(15)
                }
                R.id.gallery->{
                    setCurrentFragment(gallery)
                    vibe.vibrate(15)
                }
            }
            true
        }

        bottomnavigationview.setOnNavigationItemReselectedListener{
            when(it.itemId){
                R.id.people-> {
                    setCurrentFragment(deptfragment)
                    vibe.vibrate(50)
                }

                R.id.archive-> {
                    setCurrentFragment(archive)
                    vibe.vibrate(50)
                }
                R.id.money->{
                    setCurrentFragment(adm)
                    vibe.vibrate(50)
                }
                R.id.gallery->{
                    setCurrentFragment(gallery )
                    vibe.vibrate(50)

                }

            }

        }







//        expandBtn.setOnClickListener {
//            if (expandableLayout.visibility == View.GONE) {
//                TransitionManager.beginDelayedTransition(cardd)
//                expandableLayout.visibility = View.VISIBLE
//                expandBtn.text = "COLLAPSE"
//            } else {
//                TransitionManager.beginDelayedTransition(cardd)
//                expandableLayout.visibility = View.GONE
//                expandBtn.text = "EXPAND"
//            }
//        }


    }




    fun setCurrentFragment(fragment: Fragment)=
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.mainfragment,fragment)
            commit()
        }


}