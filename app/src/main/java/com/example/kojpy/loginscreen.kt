package com.example.kojpy

import android.content.Context
import android.content.Intent
import android.net.ConnectivityManager
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.kojpy.databinding.ActivityLoginscreenBinding
import com.google.firebase.auth.FirebaseAuth

private lateinit var binding: ActivityLoginscreenBinding
private lateinit var firebaseAuth: FirebaseAuth

class loginscreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginscreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.signuploginscreenn.setOnClickListener {
            val intent = Intent(this, signup::class.java)
            startActivity(intent)
        }

        firebaseAuth = FirebaseAuth.getInstance()

        binding.Signinbtnloginscreen.setOnClickListener {
            val email = binding.emailloginscreen.text.toString()
            val password = binding.passwordloginscreen.text.toString()

            if (email.isNotEmpty() && password.isNotEmpty()) {
                if (isNetworkAvailable()) {
                    firebaseAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener { task ->
                        if (task.isSuccessful) {
                            // Authentication successful, show a success message
                            Toast.makeText(this, "Authentication successful!", Toast.LENGTH_SHORT).show()
                            val intent = Intent(this, dashboard::class.java)
                            startActivity(intent)
                        } else {
                            val exception = task.exception
                            if (exception != null) {
                                val errorMessage = exception.message
                                if (errorMessage == "The password is invalid or the user does not have a password.") {
                                    Toast.makeText(this, "Wrong password", Toast.LENGTH_SHORT).show()
                                } else {
                                    Toast.makeText(this, "Something went wrong. Try again.", Toast.LENGTH_SHORT).show()
                                }
                            } else {
                                Toast.makeText(this, "Something went wrong. Try again.", Toast.LENGTH_SHORT).show()
                            }
                        }
                    }
                } else {
                    Toast.makeText(this, "Check your network", Toast.LENGTH_SHORT).show()
                }
            } else {
                Toast.makeText(this, "Please enter your Login Details", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun isNetworkAvailable(): Boolean {
        val connectivityManager = getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val activeNetworkInfo = connectivityManager.activeNetworkInfo
        return activeNetworkInfo != null && activeNetworkInfo.isConnected
    }
}
