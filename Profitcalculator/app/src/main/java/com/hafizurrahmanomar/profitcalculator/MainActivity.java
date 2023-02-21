package com.hafizurrahmanomar.profitcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnCalculator;
    EditText editBuy,editSell;
    TextView tvDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnCalculator = findViewById(R.id.btnCalculator);
        editBuy = findViewById(R.id.editBuy);
        editSell = findViewById(R.id.editSell);
        tvDisplay = findViewById(R.id.tvDisplay);



        btnCalculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                float buyPrice,sellPrice,profit,profitPercent;

               String bPrice= editBuy.getText().toString();

                buyPrice = Float.parseFloat(bPrice);

                String sPrice= editSell.getText().toString();
                sellPrice = Float.parseFloat(sPrice);

                profit =sellPrice-buyPrice;

                profitPercent = profit/buyPrice*100;

                if(profit>0){
                    tvDisplay.setText("Your Profit = " +profit +"\n Your profit percent= "+ profitPercent+"%");


                }else {
                    tvDisplay.setText("Your Loss = " +profit +"\n Your Loss percent= "+ profitPercent+"%");

                }





            }
        });
    }
}