package com.example.laakso.javalearningapp;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView teachingListView;
    Button startBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        teachingListView = (ListView) findViewById(R.id.teachListView);
        startBtn = (Button) findViewById(R.id.startBtn);
        Resources res = getResources();

        String[] learning_methods = res.getStringArray(R.array.learning_tools);

        ArrayAdapter<String> teachingAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, learning_methods );
        teachingListView.setAdapter(teachingAdapter);

        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"toimii",Toast.LENGTH_SHORT).show();


            }
        });

        teachingListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) {
                    Intent learningIntent = new Intent(getApplicationContext(), TerminologyActivity.class);
                    startActivity(learningIntent);
                }
                if (position == 1) {
                    Intent codeIntent = new Intent(getApplicationContext(), CodeReading.class);
                    startActivity(codeIntent);
                }

            }
        });

    }
}
