package com.example.navikotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.navigation.NavigationView
import com.google.android.material.navigationrail.NavigationRailView

class MainActivity : AppCompatActivity() {
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var navigationView: NavigationView
    lateinit var bottomNav : BottomNavigationView

    companion  object{
        const val  TAG ="MYNav"

    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        drawerLayout = findViewById(R.id.drawer_layout)
        navigationView = findViewById(R.id.navigation_view)



        // Set up the navigation drawer
        navigationView.setNavigationItemSelectedListener { menuItem ->
            menuItem.isChecked = true
            drawerLayout.closeDrawers()

            when (menuItem.itemId) {
                R.id.nav_home -> {
                    // Handle the home action
                    Toast.makeText(this, "Home", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.nav_gallery -> {
                    // Handle the gallery action
                    Toast.makeText(this, "Gallery", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.nav_settings -> {
                    // Handle the settings action
                    Toast.makeText(this, "Settings", Toast.LENGTH_SHORT).show()
                    true
                }
                else -> false
            }
        }

        //Set up the bottom navigation bar
        bottomNav = findViewById(R.id.bottomNav) as BottomNavigationView
        bottomNav.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.nav_home -> {
                    // Handle the home action
                    Toast.makeText(this, "Home", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.nav_gallery -> {
                    // Handle the gallery action
                    Toast.makeText(this, "Gallery", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.nav_settings -> {
                    // Handle the settings action
                    Toast.makeText(this, "Settings", Toast.LENGTH_SHORT).show()
                    true
                }
                else -> false
            }
        }



        val navRailFab: FloatingActionButton = findViewById(R.id.nav_rail_fab)
        navRailFab.setOnClickListener {
            Toast.makeText(this, "FAB Clicked!", Toast.LENGTH_SHORT).show()
        }
        val navigationRail: NavigationRailView = findViewById(R.id.navigationRail1)

        //Set up the navigation rail
        navigationRail.setOnItemSelectedListener { menuItem ->
            when ( menuItem.itemId) {
                R.id.nav_home -> {
                    // Handle the home action
                    Toast.makeText(this, "Home", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.nav_gallery -> {
                    // Handle the gallery action
                    Toast.makeText(this, "Gallery", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.nav_settings -> {
                    // Handle the settings action
                    Toast.makeText(this, "Settings", Toast.LENGTH_SHORT).show()
                    true
                }
                else -> false
            }
        }

    }
}