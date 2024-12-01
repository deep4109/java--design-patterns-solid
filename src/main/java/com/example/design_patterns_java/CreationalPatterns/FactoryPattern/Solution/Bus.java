package com.example.design_patterns_java.CreationalPatterns.FactoryPattern.Solution;

public class Bus implements Transport {
    @Override
    public void deliver() {
        System.out.println("Deliver by bus");
    }
}
