package com.example.design_patterns_java.SOLIDPrinciples.OpenClosePrinciple.GoodCode;

public class CreditCard implements PaymentMethod{

    @Override
    public void pay(double amount) {
        System.out.println("Making Payment via Credit Card" + amount);
    }
}
