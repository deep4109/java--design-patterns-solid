package com.example.design_patterns_java.StructuralPatterns.FlyWeightPattern.Solution;

//Flyweight Class
public class BulletType {
    private String color; //Intrinsic Property

    public BulletType(String color){
        this.color = color;
        System.out.println("Creating bulletType with color " + color);
    }
}
