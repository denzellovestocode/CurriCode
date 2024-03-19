package com.example.kojpy

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.kojpy.databinding.ActivityDashboardBinding

private lateinit var binding: ActivityDashboardBinding


class dashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityDashboardBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.programmingimg.setOnClickListener {

                    val intent=Intent(this@dashboard, programmingclass::class.java)
            startActivity(intent)
        }


        binding.cbcimg1.setOnClickListener {

            val intent=Intent(this@dashboard, assignments::class.java)
            startActivity(intent)
        }
        binding.dowlnoadbtn.setOnClickListener {

            val intent=Intent(this@dashboard, downloadapp::class.java)
            startActivity(intent)
        }





    }
}