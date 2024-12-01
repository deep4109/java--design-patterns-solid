package com.example.design_patterns_java.SOLIDPrinciples.LiskovSubstitutionprincipal.GoodCode;

public class Main {

    public static void readAnyFile(ReadableFile file){
        file.read();
    }


  /*  The Liskov Substitution Principle (LSP) is a fundamental principle in object-oriented
    programming that states that objects of a superclass should be able to be replaced with objects
    of a subclass without affecting the correctness of the program.*/

    public static void main(String[] args) {
        ReadableFile readableFile = new ReadOnlyFile();
        readableFile.read();

        WritableFile writableFile = new WritableFile();
        writableFile.read();
        writableFile.write();

        readAnyFile(readableFile);
        readAnyFile(writableFile);
    }
}
