package com.shyptsolution.nitrr

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Adapter
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.shyptsolution.nitrr.department.Department
import com.shyptsolution.nitrr.department.DepartmentData
import com.shyptsolution.nitrr.gallery.Gallery
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)









        var bottomNavigationView=findViewById<BottomNavigationView>(R.id.bottomnavigationview)
        bottomnavigationview.background=null
        bottomnavigationview.menu.getItem(2).isEnabled=false
        var firstFragment=HomeFragment()
        var deptfragment= Department()
        var gallery=Gallery()
        var fab:View= findViewById<FloatingActionButton>(R.id.floatingicon)
        fab.setOnClickListener {
            setCurrentFragment(firstFragment)
        }
        setCurrentFragment(firstFragment)
        bottomNavigationView.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.people-> {
                    setCurrentFragment(deptfragment)
                }
                R.id.home-> {
//                    setCurrentFragment(secondFragment)
                }
                R.id.archive-> {
//                    setCurrentFragment(thirdFragment)
                }
                R.id.money->{
//                    setCurrentFragment(secondFragment)
                }
                R.id.gallery->{
                    setCurrentFragment(gallery)
                }
            }
            true
        }

        bottomnavigationview.setOnNavigationItemReselectedListener{
            when(it.itemId){
                R.id.people-> {
                    setCurrentFragment(deptfragment)
                }

                R.id.archive-> {
//                    setCurrentFragment(thirdFragment)
                }
                R.id.money->{
//                    setCurrentFragment(secondFragment)
                }
                R.id.gallery->{
                    setCurrentFragment(gallery)
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