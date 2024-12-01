package com.example.design_patterns_java.StructuralPatterns.AdapterPattern;

public class Client {
    public static void main(String[] args) {
        NotificationService emailService = new EmailNotificationService();
        emailService.send("customer@codingminutes.com","order confirmation","your order has been recieved!");

        //NotificationService sendGridEmailService = new SendGridService();  --> this is problem so adapter will be used
        NotificationService emailServiceUsingSendGrid = new SendGridAdapter(new SendGridService());
        emailServiceUsingSendGrid.send("customer@codingminutes.com","order confirmation","your order has been recieved!");
    }
}
