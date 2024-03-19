package com.example.kojpy

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.kojpy.databinding.ActivityAssignmentsBinding

private lateinit var binding: ActivityAssignmentsBinding

class assignments : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAssignmentsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button1.setOnClickListener {

            val intent = Intent(this@assignments, gradeone::class.java)
            startActivity(intent)
        }
        binding.button2.setOnClickListener {

            val intent = Intent(this@assignments, gradetwo::class.java)
            startActivity(intent)
        }
        binding.button3.setOnClickListener {

            val intent = Intent(this@assignments, gradethree::class.java)
            startActivity(intent)
        }
        binding.button4.setOnClickListener {

            val intent = Intent(this@assignments, gradefour::class.java)
            startActivity(intent)
        }

    }
}






