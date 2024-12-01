package com.example.design_patterns_java.StructuralPatterns.AdapterPattern;

public class SendGridService {
    public void sendEmail(String recipient, String title, String content){
        System.out.println("Sending email via SendGrid to" + recipient);
        System.out.println("Title : " + title);
        System.out.println("Content : " + content);
    }
}