package com.example.laakso.javalearningapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CodeReading extends AppCompatActivity {

    TextView problemTextView;
    EditText answerEditText;
    Button answerBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code_reading);

        problemTextView = (TextView) findViewById(R.id.problemTextView);
        answerEditText = (EditText) findViewById(R.id.answerEditText);
        answerBtn = (Button) findViewById(R.id.checkBtn);

        double i = 253.2323;
        final int h = (int)i;
        problemTextView.setText("what int h holds if double i = 253.2323; and we take h = (int) i");

        answerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (answerBtn.getText().equals("New Problem")) {
                    answerBtn.setText("Check Answer");
                    Toast.makeText(CodeReading.this,"New problem soon!", Toast.LENGTH_SHORT).show();
                    return;
                }

                String answer = answerEditText.getText().toString();

                if (answer.equals("") || answer == null) { return; }
                else if (Integer.parseInt(answer) == h) {
                    Toast.makeText(CodeReading.this, "Damn right!", Toast.LENGTH_SHORT).show();
                    answerBtn.setText("New Problem");
                }
                else {
                    Toast.makeText(CodeReading.this, "Wrong!", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
