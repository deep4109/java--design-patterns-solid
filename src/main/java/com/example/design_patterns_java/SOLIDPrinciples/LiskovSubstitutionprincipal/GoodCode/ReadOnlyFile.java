package com.example.design_patterns_java.SOLIDPrinciples.LiskovSubstitutionprincipal.GoodCode;

import java.io.IOException;
import java.nio.CharBuffer;

public class ReadOnlyFile extends ReadableFile{

    @Override
    public int read(CharBuffer cb) throws IOException {
        return 0;
    }
}
