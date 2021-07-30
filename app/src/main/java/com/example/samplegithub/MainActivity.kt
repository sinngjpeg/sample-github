package com.example.samplegithub

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.samplegithub.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        layoutInflate()
        setContentView(binding.root)
    }

    private fun layoutInflate() {
        binding = ActivityMainBinding.inflate(layoutInflater)
    }

}