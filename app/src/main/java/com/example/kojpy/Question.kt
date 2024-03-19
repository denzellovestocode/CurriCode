package com.example.kojpy

data class Question(val question: String, val options: List<String>, val correctOptionIndex: Int, var answeredCorrectly: Boolean = false)
