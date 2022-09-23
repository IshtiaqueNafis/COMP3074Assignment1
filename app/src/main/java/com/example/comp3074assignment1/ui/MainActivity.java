package com.example.comp3074assignment1.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.comp3074assignment1.R;
import com.example.comp3074assignment1.models.PaymentCalculator;

public class MainActivity extends AppCompatActivity {

    private Button calculateTaxButton;
    private Button resetButton;
    private EditText hourlyPayment;
    private EditText hoursWorked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hourlyPayment = findViewById(R.id.hourlyRateInput);
        hoursWorked = findViewById(R.id.noOfHoursInput);
        calculateTaxButton = findViewById(R.id.calculateTaxButton);
        resetButton = findViewById(R.id.resetButton);
        calculateTax(calculateTaxButton);
        resetField(resetButton);
    }


    private void calculateTax(Button button) {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {

                    double hourlyPay = Double.parseDouble(hourlyPayment.getText().toString());
                    int hourWorked = Integer.parseInt(hoursWorked.getText().toString());
                    PaymentCalculator tax = new PaymentCalculator(hourlyPay, hourWorked);
                    Log.d("Total", tax.toString());

                } catch (Exception e) {
                    Toast.makeText(MainActivity.this, "Must fill both input", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void resetField(Button button) {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hourlyPayment.getText().clear();
                hoursWorked.getText().clear();
            }
        });
    }

}