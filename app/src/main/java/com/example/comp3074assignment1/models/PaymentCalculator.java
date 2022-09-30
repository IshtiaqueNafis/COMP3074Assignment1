package com.example.comp3074assignment1.models;

import androidx.annotation.NonNull;

import java.text.DecimalFormat;
import java.text.MessageFormat;

public class PaymentCalculator {

    //region ***properties***
    private double hourlyPayment;
    private int hoursWorked;
    private static final DecimalFormat df = new DecimalFormat("0.00");
    //endregion

    //region ***constructor***
    public PaymentCalculator(double hourlyPayment, int hoursWorked) {
        this.hourlyPayment = hourlyPayment;
        this.hoursWorked = hoursWorked;
    }
    //endregion

    //region *** getter and setters ***
    public double getHourlyPayment() {
        return hourlyPayment;
    }

    public void setHourlyPayment(double hourlyPayment) {
        this.hourlyPayment = hourlyPayment;
    }
    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    //endregion

    //region ***methods***

    private double calculateHoursWorked() {
        if (hoursWorked <= 40) {
            return hourlyPayment * (double) hoursWorked;
        }
        return ((double) hoursWorked - 40) * hourlyPayment * 1.5 + 40 * hourlyPayment;
    }


    @NonNull
    @Override
    public String toString() {
        return MessageFormat.format("Total Pay is:{0} TAX is:{1}", df.format(calculateHoursWorked()), df.format( calculateHoursWorked() * 0.18));
    }
    //endregion
}
