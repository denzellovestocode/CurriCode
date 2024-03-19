package com.example.kojpy

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class kotlinlesson2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlinlesson2)

        val textView42: TextView = findViewById(R.id.textView42)

        // Set OnClickListener for textView42
        textView42.setOnClickListener {
            // Define the URL
            val url = "https://developer.android.com/studio"

            // Create an Intent with ACTION_VIEW
            val intent = Intent(Intent.ACTION_VIEW)

            // Set the data (URL) for the Intent
            intent.data = Uri.parse(url)

            // Start the Intent
            startActivity(intent)
        }
    }
}
