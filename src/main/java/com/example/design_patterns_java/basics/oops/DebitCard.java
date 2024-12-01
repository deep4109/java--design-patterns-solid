package com.example.design_patterns_java.basics.oops;

public class DebitCard extends Card{
    public DebitCard(String cardNo, String name) {
        super(cardNo, name);
    }

    @Override
    public void pay() {
        System.out.println("Making payment via Debit Card " + cardNo);
    }
}
