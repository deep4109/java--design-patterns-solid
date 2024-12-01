package com.example.design_patterns_java.basics.oops;

public class CreditCard extends Card{
    public CreditCard(String cardNo, String name) {
        super(cardNo, name);
    }

    @Override
    public void pay() {
        System.out.println("Making payment via Credit Card");
    }
}
