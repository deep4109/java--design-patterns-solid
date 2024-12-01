package com.example.design_patterns_java.StructuralPatterns.DecoratorPattern.Problem;

public class CheesePizza extends BasicPizza{
    @Override
    public String getDescription() {
        return super.getDescription() + ", Cheese";
    }

    @Override
    public double getCost() {
        return super.getCost() + 1.00;
    }
}
