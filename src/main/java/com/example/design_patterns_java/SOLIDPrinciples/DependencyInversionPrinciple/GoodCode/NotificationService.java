package com.example.design_patterns_java.SOLIDPrinciples.DependencyInversionPrinciple.GoodCode;

public class NotificationService {
    private NotificationChannel notificationChannel;

    public NotificationService(NotificationChannel channel){
        this.notificationChannel = channel;
    }

    public void notify(String msg){
        notificationChannel.send(msg);
    }
}
