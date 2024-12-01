package com.example.design_patterns_java.SOLIDPrinciples.LiskovSubstitutionprincipal.BadCode;

public class File {
    public void read(){
        System.out.println("reading from file...");
    }
    public void write(){
        System.out.println("Writing to file...");
    }
}
