package com.example.design_patterns_java.SOLIDPrinciples.OpenClosePrinciple.GoodCode;

public class UPI implements PaymentMethod{

    @Override
    public void pay(double amount) {
        System.out.println("Making payment via UPI " +amount);
    }
}
