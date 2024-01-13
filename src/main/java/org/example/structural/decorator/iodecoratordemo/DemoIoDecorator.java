package org.example.structural.decorator.iodecoratordemo;

import java.io.*;

public class DemoIoDecorator {

    public static void main(String[] args) {
        try {
            PrintWriter printWriter = new PrintWriter(new FileOutputStream("name"));
            BufferedWriter bufferedOutputStream = new BufferedWriter(printWriter);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
