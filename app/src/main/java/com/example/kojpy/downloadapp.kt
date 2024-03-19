package com.example.kojpy

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class downloadapp : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_downloadapp)

        val textView49: TextView = findViewById(R.id.textView49)

        // Set OnClickListener for textView49
        textView49.setOnClickListener {
            // Get the text from textView49
            val textToCopy = textView49.text.toString()

            // Get the ClipboardManager
            val clipboardManager = getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager

            // Create a ClipData object to hold the text to copy
            val clipData = ClipData.newPlainText("text", textToCopy)

            // Set the ClipData to clipboard
            clipboardManager.setPrimaryClip(clipData)

            // Show a message box
            showMessageBox("Link copied, please paste in browser")
        }
    }

    private fun showMessageBox(message: String) {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Download Link")
        builder.setMessage(message)
        builder.setPositiveButton("OK") { dialog, _ ->
            dialog.dismiss()
        }
        val dialog = builder.create()
        dialog.show()
    }
}
