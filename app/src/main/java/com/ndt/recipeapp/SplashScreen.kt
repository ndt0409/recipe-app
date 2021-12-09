package com.ndt.recipeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ndt.recipeapp.databinding.ActivitySplashBinding

class SplashScreen : AppCompatActivity() {
    private lateinit var binding: ActivitySplashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivitySplashBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


    }
}