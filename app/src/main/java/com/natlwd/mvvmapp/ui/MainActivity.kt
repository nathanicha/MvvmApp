package com.natlwd.mvvmapp.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.natlwd.mvvmapp.databinding.ActivityMainBinding
import com.natlwd.mvvmapp.utils.viewBinding

class MainActivity : AppCompatActivity() {
    private val binding by viewBinding(ActivityMainBinding::inflate)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}