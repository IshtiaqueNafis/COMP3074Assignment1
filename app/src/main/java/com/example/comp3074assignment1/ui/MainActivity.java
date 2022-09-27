package com.example.comp3074assignment1.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.comp3074assignment1.R;
import com.example.comp3074assignment1.models.PaymentCalculator;

public class MainActivity extends AppCompatActivity {

    //region *** properties  ***
    private EditText hourlyPayment;
    private EditText hoursWorked;
    private TextView taxResultOutput;
    private MenuItem aboutMenuItem;
    //endregion

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hourlyPayment = findViewById(R.id.hourlyRateInput);
        hoursWorked = findViewById(R.id.noOfHoursInput);
        taxResultOutput = findViewById(R.id.taxResultText);
        Button calculateTaxButton = findViewById(R.id.calulateTaxBtn);
        Button resetButton = findViewById(R.id.resetBtn);
        aboutMenuItem = findViewById(R.id.about);
        calculateTax(calculateTaxButton);
        resetField(resetButton);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        if (item.getItemId() == R.id.about) {
            Intent intent = new Intent(this, AboutActivity.class);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    private void calculateTax(Button button) {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {
                    double hourlyPay = Double.parseDouble(hourlyPayment.getText().toString());
                    int hourWorked = Integer.parseInt(hoursWorked.getText().toString());
                    PaymentCalculator tax = new PaymentCalculator(hourlyPay, hourWorked);
                    taxResultOutput.setText(tax.toString());

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
                taxResultOutput.setText(null);
                hoursWorked.getText().clear();
            }
        });
    }

}