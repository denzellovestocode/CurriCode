package com.example.kojpy

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.kojpy.databinding.ActivityNumbersteachpageBinding

private lateinit var binding: ActivityNumbersteachpageBinding
class numbersteachpage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNumbersteachpageBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.numberslesson.setOnClickListener {

            val intent = Intent(this, QuizActivity::class.java)
            startActivity(intent)

        }
        binding.numbersvideo.setOnClickListener {

            val intent = Intent(this, numbersvideo::class.java)
            startActivity(intent)

        }

    }
}





