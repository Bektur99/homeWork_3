package com.example.homework_3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.homework_3.adapter.ViewPagerAdapter
import com.example.homework_3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: ViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        adapter = ViewPagerAdapter(this)
        binding.viewpager2.adapter = adapter
    }
}