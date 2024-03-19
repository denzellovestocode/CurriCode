package com.example.kojpy

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.kojpy.databinding.ActivityAssignmentsBinding
import com.example.kojpy.databinding.ActivityTopicsBinding

private lateinit var binding: ActivityTopicsBinding

class topics : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTopicsBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.topic1.setOnClickListener {

            val intent = Intent(this@topics, development::class.java)
            startActivity(intent)
        }
        binding.topic2.setOnClickListener {

            val intent = Intent(this@topics, development::class.java)
            startActivity(intent)
        }
        binding.topic3.setOnClickListener {

            val intent = Intent(this@topics, MathematicsGradeOne::class.java)
            startActivity(intent)
        }

    }
}






