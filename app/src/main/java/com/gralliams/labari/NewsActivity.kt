package com.gralliams.labari

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gralliams.labari.databinding.ActivityNewsBinding

class NewsActivity : AppCompatActivity() {
    lateinit var binding: ActivityNewsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewsBinding.inflate(layoutInflater)
        setContentView(binding.root)


//        button.setOnClickListener
    }
}