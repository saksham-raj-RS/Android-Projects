package com.example.tapcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button countBtn;
    Button reset;

    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countBtn = findViewById(R.id.button);

        reset = findViewById(R.id.button2);



        countBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter += 1;

                String result = Integer.toString(counter);

                countBtn.setText(result);

            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                counter = 0;

                String result = Integer.toString(counter);

                countBtn.setText(result);

            }
        });


    }
}