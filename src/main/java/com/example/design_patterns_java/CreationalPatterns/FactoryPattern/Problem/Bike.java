package com.example.design_patterns_java.CreationalPatterns.FactoryPattern.Problem;

public class Bike implements Transport{
    @Override
    public void deliver() {
        System.out.println("Deliver by bike");
    }
}
