package com.example.kojpy

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.kojpy.databinding.ActivityProgrammingclassBinding


private lateinit var binding: ActivityProgrammingclassBinding

class programmingclass : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityProgrammingclassBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.javascriptimg.setOnClickListener {
                  val intent = Intent(this@programmingclass, pythonintro::class.java)
                  startActivity(intent)
        }



          binding.kotlinimg .setOnClickListener {

              val intent = Intent(this@programmingclass, kotlintopics::class.java)
              startActivity(intent)

          }
         binding.pythomimg.setOnClickListener {


             val intent= Intent(this@programmingclass, pythonintro::class.java)
             startActivity(intent)
         }


    }
}