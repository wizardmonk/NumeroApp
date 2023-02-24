package com.example.numero.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import com.example.numero.R
import com.example.numero.databinding.ActivityGetDataBinding
import java.util.zip.Inflater

class GetDataActivity : AppCompatActivity() {
    lateinit var binding: ActivityGetDataBinding
    lateinit var name: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGetDataBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val btn = binding.doneBtn


        btn.setOnClickListener {
            name = binding.fname.text.toString()
            var destiny = 0
            var baseNumber= 0

            var destinyv =

                binding.DD.text.toString() +
                        binding.MM.text.toString() +
                        binding.YY.text.toString()






            for (i in destinyv){
                destiny = i.toString().toInt()+ destiny
            }
            for (i in binding.DD.text){
                baseNumber+= i.toString().toInt()
            }



            Log.d("Mytagdestiny", calc(destinyv).toString())

            Log.d("Mytag Base", calc(binding.DD.text.toString()).toString())
            val intent = Intent(this, YourNumberActivity::class.java)
            intent.putExtra("destiny", calc(destinyv).toString())
            intent.putExtra("base",  calc(binding.DD.text.toString()).toString())
            intent.putExtra("fname", name.toString())

            startActivity(intent)
        }


    }


    private fun calc(str:String):Int{
        var temp=0
        for (i in 0..str.length-1){
            temp = str[i].toString().toInt() + temp
        }
        if (temp>9){
            temp=calc(temp.toString())

        }
        return temp
    }
}