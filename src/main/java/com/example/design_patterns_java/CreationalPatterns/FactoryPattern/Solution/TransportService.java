package com.example.design_patterns_java.CreationalPatterns.FactoryPattern.Solution;


public class TransportService {
    public static void main(String[] args) {
        //Direct create objects
        Transport vehicle = TransportFactory.createTransport("car");
        vehicle.deliver();
    }
}
