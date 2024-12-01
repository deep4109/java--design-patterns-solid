package com.example.design_patterns_java.SOLIDPrinciples.LiskovSubstitutionprincipal.BadCode;

public class Main {

  /*  The Liskov Substitution Principle (LSP) is a fundamental principle in object-oriented
    programming that states that objects of a superclass should be able to be replaced with objects
    of a subclass without affecting the correctness of the program.*/

    public static void main(String[] args) {
        File file = new ReadOnlyFile();
        file.read(); //works fine
        file.write(); // throwing an exception, violation of LSP

    }
}
