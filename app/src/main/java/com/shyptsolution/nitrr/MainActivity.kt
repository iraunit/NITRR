package com.shyptsolution.nitrr

import android.graphics.drawable.Icon
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.google.android.material.bottomappbar.BottomAppBar
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var bottomNavigationView=findViewById<BottomNavigationView>(R.id.bottomnavigationview)
        bottomnavigationview.background=null
        bottomnavigationview.menu.getItem(2).isEnabled=false
        var firstFragment=MainFragment()
        var secondFragment=SecondFragment()
        var thirdFragment=ThirdFragment()
        var fab:View= findViewById<FloatingActionButton>(R.id.floatingicon)
        fab.setOnClickListener {
            setCurrentFragment(firstFragment)
        }
        setCurrentFragment(firstFragment)
        bottomNavigationView.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.people-> {
                    setCurrentFragment(firstFragment)
                    Toast.makeText(this,"hello",Toast.LENGTH_SHORT).show()
                }
                R.id.home-> {
                    setCurrentFragment(secondFragment)
                }
                R.id.archive-> {
                    setCurrentFragment(thirdFragment)
                }
                R.id.money->{
                    setCurrentFragment(secondFragment)
                }
                R.id.gallery->{
                    setCurrentFragment(firstFragment)
                }
            }
            true
        }

        bottomnavigationview.setOnNavigationItemReselectedListener{
            when(it.itemId){
                R.id.people-> {
                    setCurrentFragment(firstFragment)
                    Toast.makeText(this,"hello",Toast.LENGTH_SHORT).show()
                }
                R.id.home-> {
                    setCurrentFragment(secondFragment)
                }
                R.id.archive-> {
                    setCurrentFragment(thirdFragment)
                }
                R.id.money->{
                    setCurrentFragment(secondFragment)
                }
                R.id.gallery->{
                    setCurrentFragment(secondFragment)
                }

            }

        }

    }




    fun setCurrentFragment(fragment: Fragment)=
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.mainfragment,fragment)
            commit()
        }
}