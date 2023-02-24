package com.example.numero.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.numero.R
import com.example.numero.databinding.ActivityGetDataBinding
import com.example.numero.databinding.ActivityYourNumberBinding

class YourNumberActivity : AppCompatActivity() {
    lateinit var binding :ActivityYourNumberBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityYourNumberBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent= getIntent()
        binding.destiny.text= intent.getStringExtra("destiny")
        binding.basenumber.text= intent.getStringExtra("base")
        binding.welcomeLabel.text ="Welcome " + intent.getStringExtra("fname")

    }
}