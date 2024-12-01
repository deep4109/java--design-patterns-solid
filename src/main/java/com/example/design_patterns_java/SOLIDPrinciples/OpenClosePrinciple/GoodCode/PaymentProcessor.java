package com.example.design_patterns_java.SOLIDPrinciples.OpenClosePrinciple.GoodCode;

public class PaymentProcessor {
    public void processPayment(PaymentMethod paymentMethod,double amount){
       paymentMethod.pay(amount);
    }
}
