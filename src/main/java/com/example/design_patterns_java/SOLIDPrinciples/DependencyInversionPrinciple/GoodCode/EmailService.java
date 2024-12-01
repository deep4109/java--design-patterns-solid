package com.example.design_patterns_java.SOLIDPrinciples.DependencyInversionPrinciple.GoodCode;

public class EmailService implements NotificationChannel{
    @Override
    public void send(String msg) {
        System.out.println("Sending Email " + msg);
    }
}
