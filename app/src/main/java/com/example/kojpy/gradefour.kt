package com.example.kojpy

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class gradefour : AppCompatActivity() {
    private var selectedTopicName = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gradefour)

        val mathematicsLayout = findViewById<LinearLayout>(R.id.mathematicslayoutt)
        val hygieneLayout = findViewById<LinearLayout>(R.id.hygenelayoutt)
        val environmentalLayout = findViewById<LinearLayout>(R.id.environmentallayoutgg)
        val englishLayout = findViewById<LinearLayout>(R.id.englishlayoutt)
        val startBtn = findViewById<Button>(R.id.butttonn)

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
                Toast.makeText(this@gradefour, "Please select the Topic", Toast.LENGTH_SHORT).show()
            } else {
                // Start activity based on selected topic
                when (selectedTopicName) {
                    "mathematicsLayout" -> startGradeActivity(MathematicsGradeOne::class.java)
                    // Add other cases for other topics if needed
                }
            }
        }
    }

    private fun startGradeActivity(cls: Class<*>) {
        val intent = Intent(this@gradefour, cls)
        startActivity(intent)
    }

    private fun highlightSelectedTopic(layout: LinearLayout) {
        // Reset all backgrounds
        val mathematicsLayout = findViewById<LinearLayout>(R.id.mathematicslayoutt)
        val hygieneLayout = findViewById<LinearLayout>(R.id.hygenelayoutt)
        val environmentalLayout = findViewById<LinearLayout>(R.id.environmentallayoutgg)
        val englishLayout = findViewById<LinearLayout>(R.id.englishlayoutt)
        mathematicsLayout.setBackgroundResource(R.drawable.round_back_white10)
        hygieneLayout.setBackgroundResource(R.drawable.round_back_white10)
        environmentalLayout.setBackgroundResource(R.drawable.round_back_white10)
        englishLayout.setBackgroundResource(R.drawable.round_back_white10)

        // Highlight the selected topic
        layout.setBackgroundResource(R.drawable.round_back_white_stroke10)
    }
}
