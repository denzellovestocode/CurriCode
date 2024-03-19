package com.example.kojpy

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {

    private val SPLASH_DELAY: Long = 5000 // 15 seconds

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // Use a Handler to delay opening the loginscreen
        Handler().postDelayed({
            // Create an Intent to open the loginscreen
            val intent = Intent(this, loginscreen::class.java)
            startActivity(intent)
            finish() // Close the SplashActivity to prevent going back to it
        }, SPLASH_DELAY)
    }
}
