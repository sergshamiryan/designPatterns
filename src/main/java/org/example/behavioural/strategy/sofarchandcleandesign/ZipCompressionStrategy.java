package org.example.behavioural.strategy.sofarchandcleandesign;

import java.util.List;

public class ZipCompressionStrategy implements CompressionStrategy{
    @Override
    public void compresFiles(List<File> files) {
        System.out.println("Compressing files With ZIP");
    }
}
