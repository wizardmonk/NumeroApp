package com.example.numero.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.numero.R
import com.example.numero.databinding.ActivitySignUpBinding

class SignUpActivity : AppCompatActivity() {

    lateinit var binding: ActivitySignUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)



    }
}