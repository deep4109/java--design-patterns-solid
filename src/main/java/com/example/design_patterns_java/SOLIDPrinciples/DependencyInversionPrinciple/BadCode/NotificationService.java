package com.example.design_patterns_java.SOLIDPrinciples.DependencyInversionPrinciple.BadCode;

public class NotificationService {
    private EmailService emailService;
    private SMSService smsService;

    public NotificationService(){
        this.emailService = new EmailService();
        this.smsService = new SMSService();
    }

    public void notifyByEmail(String msg){
        emailService.sendEmail(msg);
    }
    public void notifyBySMS(String msg){
        smsService.sendSMS(msg);
    }
}
