package com.example.kojpy

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class gradethree : AppCompatActivity() {
    private var selectedTopicName = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gradethree)

        val mathematicsLayout = findViewById<LinearLayout>(R.id.mathematicslayouttg3)
        val hygieneLayout = findViewById<LinearLayout>(R.id.hygenelayouttg3)
        val environmentalLayout = findViewById<LinearLayout>(R.id.environmentallayoutggg3)
        val englishLayout = findViewById<LinearLayout>(R.id.englishlayouttg3)
        val startBtn = findViewById<Button>(R.id.butttonng3)

        mathematicsLayout.setOnClickListener {
            selectedTopicName = "mathematicsLayout"
            highlightSelectedTopic(mathematicsLayout)
        }
        hygieneLayout.setOnClickListener {
            selectedTopicName = "hygieneLayout"
            highlightSelectedTopic(hygieneLayout)
        }
        environmentalLayout.setOnClickListener {
            selectedTopicName = "environmentalLayout"
            highlightSelectedTopic(environmentalLayout)
        }
        englishLayout.setOnClickListener {
            selectedTopicName = "englishLayout"
            highlightSelectedTopic(englishLayout)
        }
        startBtn.setOnClickListener {
            if (selectedTopicName.isEmpty()) {
                Toast.makeText(this@gradethree, "Please select the Topic", Toast.LENGTH_SHORT).show()
            } else {
                // Start activity based on selected topic
                when (selectedTopicName) {
                    "mathematicsLayout" -> startGradeActivity(development::class.java)
                    "englishLayout" -> startGradeActivity(development::class.java)
                    "environmentalLayout" -> startGradeActivity(development::class.java)
                    "hygieneLayout" -> startGradeActivity(development::class.java)
                    // Add other cases for other topics if needed
                }
            }
        }
    }

    private fun startGradeActivity(cls: Class<*>) {
        val intent = Intent(this@gradethree, cls)
        startActivity(intent)
    }

    private fun highlightSelectedTopic(layout: LinearLayout) {
        // Reset all backgrounds
        val mathematicsLayout = findViewById<LinearLayout>(R.id.mathematicslayouttg3)
        val hygieneLayout = findViewById<LinearLayout>(R.id.hygenelayouttg3)
        val environmentalLayout = findViewById<LinearLayout>(R.id.environmentallayoutggg3)
        val englishLayout = findViewById<LinearLayout>(R.id.englishlayouttg3)
        mathematicsLayout.setBackgroundResource(R.drawable.round_back_white10)
        hygieneLayout.setBackgroundResource(R.drawable.round_back_white10)
        environmentalLayout.setBackgroundResource(R.drawable.round_back_white10)
        englishLayout.setBackgroundResource(R.drawable.round_back_white10)

        // Highlight the selected topic
        layout.setBackgroundResource(R.drawable.round_back_white_stroke10)
    }
}
