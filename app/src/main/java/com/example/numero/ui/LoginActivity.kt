package com.example.numero.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.numero.R
import com.example.numero.databinding.ActivitySignUpBinding

class LoginActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var binding: ActivitySignUpBinding

        super.onCreate(savedInstanceState)

        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}