package com.example.kojpy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.kojpy.databinding.ActivitySignupBinding
import com.google.firebase.auth.FirebaseAuth

private lateinit var binding: ActivitySignupBinding
private lateinit var firebaseAuth: FirebaseAuth

class signup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignupBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.signinsignupscreen.setOnClickListener {
            val intent = Intent(this@signup, loginscreen::class.java)
            startActivity(intent)


        }

        firebaseAuth= FirebaseAuth.getInstance()

        binding.Signupbtnsignupscreen.setOnClickListener {
            val email = binding.emailsignupscreen.text.toString()
            val password = binding.passwordsignup.text.toString()
            val confirmpassword = binding.confirmpasswordsignup.text.toString()


            if (email .isNotEmpty() && password.isNotEmpty() && confirmpassword.isNotEmpty()){

                if (password==confirmpassword){

                    firebaseAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener {
                        if (it.isSuccessful){
                            val intent=Intent(this,dashboard::class.java)
                            startActivity(intent)

                        }else{
                            Toast.makeText(this, it.exception.toString(), Toast.LENGTH_SHORT).show()

                        }
                    }


                }else{
                    Toast.makeText(this, "Password does not match", Toast.LENGTH_SHORT).show()
                }
            }else{
                Toast.makeText(this, "Empty fields are not allowed", Toast.LENGTH_SHORT).show()
            }



        }





    }
}