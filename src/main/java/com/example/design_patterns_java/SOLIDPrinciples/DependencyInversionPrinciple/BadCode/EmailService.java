package com.example.design_patterns_java.SOLIDPrinciples.DependencyInversionPrinciple.BadCode;

public class EmailService {
    public void sendEmail(String message) {
        System.out.println("Sending email: " + message);
    }
}
