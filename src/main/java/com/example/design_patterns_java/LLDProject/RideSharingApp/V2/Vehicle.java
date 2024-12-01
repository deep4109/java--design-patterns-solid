package com.example.design_patterns_java.LLDProject.RideSharingApp.V2;

abstract class Vehicle {
    protected String numberPlate;

    public Vehicle(String numberPlate){
        this.numberPlate = numberPlate;
    }
    //Fare Calc
    public abstract double getFarePerKm();
}
