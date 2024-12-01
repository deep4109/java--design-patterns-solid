package com.example.design_patterns_java.basics.oops;

public class Wallet implements PaymentMethod{
    @Override
    public void pay() {
        System.out.println("Making payment via wallet");
    }
}
