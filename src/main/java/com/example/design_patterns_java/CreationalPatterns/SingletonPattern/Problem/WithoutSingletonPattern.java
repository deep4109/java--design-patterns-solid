package com.example.design_patterns_java.CreationalPatterns.SingletonPattern.Problem;

public class WithoutSingletonPattern {
    public static void main(String[] args) {
        AppSettings appSettings = new AppSettings();
        AppSettings appSettingsCopy = new AppSettings();

        System.out.println(appSettingsCopy.getApiKey());
        System.out.println(appSettings.getApiKey());

        //More memory
        System.out.println(appSettings==appSettingsCopy);

    }
}