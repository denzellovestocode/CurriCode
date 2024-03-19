package com.example.kojpy

import android.annotation.SuppressLint
import android.net.Uri
import android.os.Bundle
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity

class numbersvideo : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_numbersvideo)

        val videoView = findViewById<VideoView>(R.id.numbersvid)
        val packagename = "android.resource://" + getPackageName() +"/" + R.raw.numbersgrade1
        val uri = Uri.parse(packagename)
        videoView.setVideoURI(uri)

        val mediacontorller = android.widget.MediaController(this)
        videoView.setMediaController(mediacontorller)



    }
}