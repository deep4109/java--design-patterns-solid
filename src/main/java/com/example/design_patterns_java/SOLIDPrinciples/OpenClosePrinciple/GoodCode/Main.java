package com.example.design_patterns_java.SOLIDPrinciples.OpenClosePrinciple.GoodCode;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();
        PaymentMethod creditCard = new CreditCard();
        PaymentMethod upi = new UPI();

        processor.processPayment(creditCard,100);
        processor.processPayment(upi,120);
    }
}
