package com.akih.materiweek1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.akih.materiweek1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val FragmentManager = supportFragmentManager
        val firstFragment = FirstFragment()
        val secondFragment = SecondFragment()
        setContentView(binding.root)
        binding.btnFragment1.setOnClickListener {
            FragmentManager
                .beginTransaction()
                .replace(R.id.container_fragment, firstFragment, FirstFragment::class.java.simpleName)
                .addToBackStack(null)
                .commit()
        }
        binding.btnProfile.setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
        }
        binding.btnFragment2.setOnClickListener {
            FragmentManager
                .beginTransaction()
                .replace(R.id.container_fragment, secondFragment, SecondFragment::class.java.simpleName)
                .addToBackStack(null)
                .commit()
        }
    }
}