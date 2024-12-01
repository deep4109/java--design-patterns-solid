package com.example.design_patterns_java.SOLIDPrinciples.InterfaceSegregationPrinciple.BadCode;

// Monolithic Machine interface
interface Machine {
    void print(Document doc);
    void scan(Document doc);
    void copy(Document doc);
}
