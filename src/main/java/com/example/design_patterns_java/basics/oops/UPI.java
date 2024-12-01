package com.example.design_patterns_java.basics.oops;

public class UPI implements PaymentMethod{
    String upiId;

    UPI(String id){
        this.upiId = id;
    }

    @Override
    public void pay() {
        System.out.println("Making payment via UPI "+upiId);
    }
}
