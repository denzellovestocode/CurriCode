package com.example.kojpy

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.kojpy.databinding.ActivityKotlintopicsBinding
import com.example.kojpy.databinding.ActivityProgrammingclassBinding


private lateinit var binding: ActivityKotlintopicsBinding

class kotlintopics : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityKotlintopicsBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.kotlinintro.setOnClickListener {
            val intent = Intent(this@kotlintopics, kotlinintro::class.java)
            startActivity(intent)
        }

        binding.downloadingas .setOnClickListener {

            val intent = Intent(this@kotlintopics, kotlinlesson2::class.java)
            startActivity(intent)

        }
        binding.settingupas.setOnClickListener {


            val intent= Intent(this@kotlintopics, kotlinlesson1::class.java)
            startActivity(intent)
        }

        binding.firstactivity.setOnClickListener {


            val intent= Intent(this@kotlintopics, development::class.java)
            startActivity(intent)
        }
        binding.addindsdks.setOnClickListener {


            val intent= Intent(this@kotlintopics, development::class.java)
            startActivity(intent)
        }
        binding.firstcode.setOnClickListener {


            val intent= Intent(this@kotlintopics, development::class.java)
            startActivity(intent)
        }
        binding.formattingcode.setOnClickListener {


            val intent= Intent(this@kotlintopics, development::class.java)
            startActivity(intent)
        }


    }
}