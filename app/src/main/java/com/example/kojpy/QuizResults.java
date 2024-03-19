package com.example.kojpy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class QuizResults extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_results);

        final AppCompatButton startNewBtn = findViewById(R.id.startNewQuizBtn);
        final TextView correctAnswer = findViewById(R.id.correctAnswers);
        final TextView incorrectAnswer = findViewById(R.id.incorrectAnswers);

        final int getCorrectAnswer = getIntent().getIntExtra("correct",0);
        final int getIncorrectAnswer = getIntent().getIntExtra("incorrect",0);

        correctAnswer.setText(String.valueOf(getCorrectAnswer));
        incorrectAnswer.setText(String.valueOf(getIncorrectAnswer));

        startNewBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(QuizResults.this,gradeone.class));
                finish();
            }
        });

    }

    public void onBackPressed(View view) {
        startActivity(new Intent(QuizResults.this,QuizActivity.class));
        finish();
    }

}






