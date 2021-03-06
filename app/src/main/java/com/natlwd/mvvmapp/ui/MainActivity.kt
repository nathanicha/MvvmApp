package com.natlwd.mvvmapp.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.natlwd.mvvmapp.databinding.ActivityMainBinding
import com.natlwd.mvvmapp.utils.viewBinding

class MainActivity : AppCompatActivity() {
    private val binding by viewBinding(ActivityMainBinding::inflate)
    private val model: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        model.getUsers("1").observe(this, { users ->
            binding.mainActivityTextView.text = users?.title
        })
    }
}