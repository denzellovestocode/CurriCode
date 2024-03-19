package com.example.kojpy

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class gradeone : AppCompatActivity() {
    private var selectedTopicName = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gradeone)
        val mathematicsLayout = findViewById<LinearLayout>(R.id.mathematicslayout)
        val hygieneLayout = findViewById<LinearLayout>(R.id.hygienelayout)
        val environmentalLayout = findViewById<LinearLayout>(R.id.environmentallayout)
        val englishLayout = findViewById<LinearLayout>(R.id.englishlayout)
        val startBtn = findViewById<Button>(R.id.startquiz)
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
                Toast.makeText(this@gradeone, "Please select the Topic", Toast.LENGTH_SHORT).show()
            } else {
                // Start activity based on selected topic
                when (selectedTopicName) {
                    "mathematicsLayout" -> startGradeActivity(topics::class.java)
                    "hygieneLayout" -> startGradeActivity(development::class.java)
                    "environmentalLayout" -> startGradeActivity(development::class.java)
                    "englishLayout" -> startGradeActivity(development::class.java)
                }
            }
        }
    }

    private fun startGradeActivity(cls: Class<*>) {
        val intent = Intent(this@gradeone, cls)
        startActivity(intent)
    }

    private fun highlightSelectedTopic(layout: LinearLayout) {
        // Reset all backgrounds
        val mathematicsLayout = findViewById<LinearLayout>(R.id.mathematicslayout)
        val hygieneLayout = findViewById<LinearLayout>(R.id.hygienelayout)
        val environmentalLayout = findViewById<LinearLayout>(R.id.environmentallayout)
        val englishLayout = findViewById<LinearLayout>(R.id.englishlayout)
        mathematicsLayout.setBackgroundResource(R.drawable.round_back_white10)
        hygieneLayout.setBackgroundResource(R.drawable.round_back_white10)
        environmentalLayout.setBackgroundResource(R.drawable.round_back_white10)
        englishLayout.setBackgroundResource(R.drawable.round_back_white10)

        // Highlight the selected topic
        layout.setBackgroundResource(R.drawable.round_back_white_stroke10)
    }
}
