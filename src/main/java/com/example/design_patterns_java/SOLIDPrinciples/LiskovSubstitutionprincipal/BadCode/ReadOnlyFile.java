package com.example.design_patterns_java.SOLIDPrinciples.LiskovSubstitutionprincipal.BadCode;

public class ReadOnlyFile extends File{
    public void write(){
        throw new UnsupportedOperationException("Can't write to a read only file");
    }
}
