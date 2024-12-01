package com.example.design_patterns_java.SOLIDPrinciples.DependencyInversionPrinciple.BadCode;

class SMSService {
    public void sendSMS(String message) {
        System.out.println("Sending SMS: " + message);
    }
}