package com.example.design_patterns_java.SOLIDPrinciples.SingleResponsibilityPrincipal.GoodCode;

public class Invoice {
    private double amount;

    public Invoice(double amount){
        this.amount = amount;
    }

    //Additional Functionality
    public void generateInvoice(){
        System.out.println("Invoice generated & printed for amount " +amount);
    }
}
