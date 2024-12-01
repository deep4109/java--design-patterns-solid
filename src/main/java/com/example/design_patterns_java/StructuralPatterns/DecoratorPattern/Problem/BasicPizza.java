package com.example.design_patterns_java.StructuralPatterns.DecoratorPattern.Problem;

public class BasicPizza implements Pizza{
    @Override
    public String getDescription() {
        return "Basic Pizza";

    }

    @Override
    public double getCost() {
        return 5.00; //base cost
    }
}
