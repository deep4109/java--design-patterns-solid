package com.example.design_patterns_java.SOLIDPrinciples.InterfaceSegregationPrinciple.GoodCode;


import com.example.design_patterns_java.SOLIDPrinciples.InterfaceSegregationPrinciple.BadCode.Document;

public class SimplerPrinter implements Printer{
    @Override
    public void print(Document doc) {
        System.out.println("Printing the document");
    }
}
