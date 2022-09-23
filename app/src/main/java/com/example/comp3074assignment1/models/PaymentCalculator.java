package com.example.comp3074assignment1.models;

import java.text.MessageFormat;

public class PaymentCalculator {
    private double hourlyPayment;
    private int hoursWorked;

    public PaymentCalculator(double hourlyPayment, int hoursWorked) {
        this.hourlyPayment = hourlyPayment;
        this.hoursWorked = hoursWorked;
    }

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

    private double calculateHoursWorked() {
        if (hoursWorked <= 40) {
            return hourlyPayment * hoursWorked;
        }
        return (hoursWorked - 40) * hourlyPayment * 1.5 + 40 * hourlyPayment;
    }

    @Override
    public String toString() {
        return MessageFormat.format("Total Pay is:{0} TAX is:{1}", calculateHoursWorked(), calculateHoursWorked() * 0.18);
    }
}
