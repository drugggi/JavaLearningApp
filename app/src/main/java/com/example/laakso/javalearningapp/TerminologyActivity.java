package com.example.laakso.javalearningapp;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class TerminologyActivity extends AppCompatActivity {


    Button getAnswer;
    TextView termTextView;
    TextView explanationTextView;
    String[] questions;
    Random nro_generator;
    int question_nro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terminology);

        Resources res = getResources();
        questions = res.getStringArray(R.array.term_explanation);

        getAnswer = (Button) findViewById(R.id.answerBtn);
        termTextView = (TextView) findViewById(R.id.termTextView);
        explanationTextView = (TextView) findViewById(R.id.explanationTextView);
        getAnswer.setText("get answer");

        nro_generator = new Random();
        question_nro = nro_generator.nextInt(questions.length);
        if (question_nro % 2 == 1) {question_nro--; }

        termTextView.setText(questions[question_nro]);

        getAnswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Set answer text under the term
                if (getAnswer.getText().equals("get answer") ) {
                    explanationTextView.setText(questions[question_nro + 1]);
                    getAnswer.setText("new term");
                }
                // Get new term and set answer to empty
                else {
                    question_nro = nro_generator.nextInt(questions.length);
                    if (question_nro % 2 == 1) {
                        question_nro--;
                    }
                    termTextView.setText(questions[question_nro]);
                    explanationTextView.setText("");
                    getAnswer.setText("get answer");
                }
            }
        });
    }
}
