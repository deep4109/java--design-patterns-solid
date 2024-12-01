package com.example.design_patterns_java.CreationalPatterns.SingletonPattern.Problem;

public class AppSettings {
    private String databaseUrl;
    private String apiKey;

    public AppSettings(){
        //Read settings from a config file
        databaseUrl = "jdbc:mysql://localhost:3306/mydatabase";
        apiKey = "12345-ABCDE";
    }

    public String getDatabaseUrl(){
        return databaseUrl;
    }
    public String getApiKey(){
        return apiKey;
    }
}
