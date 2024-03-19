package com.example.kojpy

import android.annotation.SuppressLint
import android.net.Uri
import android.os.Bundle
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity
import com.example.kojpy.databinding.ActivityPythonintroBinding


private lateinit var binding: ActivityPythonintroBinding

class pythonintro : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pythonintro)

        val videoView = findViewById<VideoView>(R.id.python_introduction_video)
        val packagename = "android.resource://" + getPackageName() +"/" + R.raw.python_video
        val uri = Uri.parse(packagename)
        videoView.setVideoURI(uri)

        val mediacontorller = android.widget.MediaController(this)
        videoView.setMediaController(mediacontorller)



    }
}