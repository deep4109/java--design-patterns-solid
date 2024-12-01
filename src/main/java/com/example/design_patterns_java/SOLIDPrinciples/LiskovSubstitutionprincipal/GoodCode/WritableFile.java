package com.example.design_patterns_java.SOLIDPrinciples.LiskovSubstitutionprincipal.GoodCode;

import java.io.IOException;
import java.nio.CharBuffer;

public class WritableFile extends ReadableFile implements Writable {

    @Override
    public void write() {
        System.out.println("Writing to a file ...");
    }

    @Override
    public int read(CharBuffer cb) throws IOException {
        return 0;
    }
}
