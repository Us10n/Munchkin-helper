package com.example.munchkinhelper

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import com.example.munchkinhelper.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.d("mine", "Oncreate")
//        setSupportActionBar(binding.toolBar)

//        var toggle: ActionBarDrawerToggle = ActionBarDrawerToggle(
//            this, binding.drawer, binding.toolBar,
//            R.string.navigation_drawer_open, R.string.navigation_drawer_close
//        )
//
//        binding.drawer.addDrawerListener(toggle)
//        toggle.syncState()

        binding.shuffleButton.visibility=View.GONE
        binding.checkButton.visibility=View.GONE

        binding.drawerButton.setOnClickListener(this)
        binding.resetButton.setOnClickListener(this)
        binding.diceButton.setOnClickListener(this)
//        binding.shuffleButton.setOnClickListener(this)
        binding.editButton.setOnClickListener(this)
//        binding.checkButton.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.drawerButton -> binding.drawerLayout.openDrawer(GravityCompat.START)
            else -> Toast.makeText(this, "Click", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onBackPressed() {
        if (binding.drawerLayout.isDrawerOpen(GravityCompat.START)) {
            binding.drawerLayout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }
}