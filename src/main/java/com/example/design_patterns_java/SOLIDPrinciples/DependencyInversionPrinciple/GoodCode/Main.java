package com.example.design_patterns_java.SOLIDPrinciples.DependencyInversionPrinciple.GoodCode;


public class Main {

 /*   High-level modules should not depend on low-level modules:
    High-level modules, which provide complex logic, should be reusable and unaffected by changes in low-level modules.*/
    public static void main(String[] args) {
        NotificationService emailNotification = new NotificationService(new EmailService());
        emailNotification.notify("Your order has been shipped");

        NotificationService smsNotification = new NotificationService(new SMSService());
        smsNotification.notify("OTP 1234");
    }
}
