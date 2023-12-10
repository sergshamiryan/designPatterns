package org.example.structural.proxy.problem3;

public class RealOperation implements Operation {
    public final String lowerCaseWord;

    public RealOperation(String lowerCase) {
        this.lowerCaseWord = lowerCase;
    }

    @Override
    public String executeUpperCasing() {
        return this.lowerCaseWord.toUpperCase();
    }
}
