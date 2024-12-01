package com.example.design_patterns_java.SOLIDPrinciples.LiskovSubstitutionprincipal.GoodCode;

import java.io.IOException;
import java.nio.CharBuffer;

public abstract class ReadableFile implements Readable {

    public void read(){
        System.out.println("Reading from a file");
    }

    public abstract int read(CharBuffer cb) throws IOException;
}
