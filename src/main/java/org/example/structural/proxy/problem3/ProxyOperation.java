package org.example.structural.proxy.problem3;

import java.time.LocalDateTime;
import java.util.Objects;

public class ProxyOperation implements Operation {
    private final String lowerCaseWord;
    private final RealOperation realOperation;

    public ProxyOperation(String lowerCaseWord) {
        this.lowerCaseWord = Objects.requireNonNull(
                lowerCaseWord, "lowerCaseWord cannot be null");
        this.realOperation = new RealOperation(this.lowerCaseWord);
    }

    @Override
    public String executeUpperCasing() {
        System.out.printf(
                """
                        Time operation is applied : %s
                        The string before : %s
                        """,
                LocalDateTime.now(), this.lowerCaseWord);
        String upperCase = realOperation.executeUpperCasing();
        System.out.printf("String after upper casing : %s\n", upperCase);
        return upperCase;
    }
}
