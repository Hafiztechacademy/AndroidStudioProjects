package com.hafizurrahmanomar.tasbeehcounter_dailyzikir;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvDisplay;
    Button addButton,subButton,resetButton;
    int count =0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDisplay = findViewById(R.id.tvDisplay);
        addButton = findViewById(R.id.addButton);
        subButton = findViewById(R.id.subButton);
        resetButton = findViewById(R.id.resetButton);


//        ============addButton===========================
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                code here

                count++;
                tvDisplay.setText(""+count);


            }
        });
//      ================subButton========================

        subButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                code here
                count--;
                tvDisplay.setText(""+count);


            }
        });

//        ===============resetButton=====================

        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


//                code here

                count=0;
                tvDisplay.setText(""+count);



            }
        });

    }
}