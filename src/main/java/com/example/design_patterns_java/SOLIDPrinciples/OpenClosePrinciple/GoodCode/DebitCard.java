package com.example.design_patterns_java.SOLIDPrinciples.OpenClosePrinciple.GoodCode;

public class DebitCard implements PaymentMethod{

    @Override
    public void pay(double amount) {
        System.out.println("Making Payment via Debit Card " + amount);
    }
}