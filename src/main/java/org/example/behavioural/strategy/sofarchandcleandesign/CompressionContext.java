package org.example.behavioural.strategy.sofarchandcleandesign;

import java.util.List;

public class CompressionContext {
    private CompressionStrategy compressionStrategy;

    public CompressionContext(CompressionStrategy compressionStrategy) {
        this.compressionStrategy = compressionStrategy;
    }

    public void compressFiles(List<File> fileList) {
        compressionStrategy.compresFiles(fileList);
    }

    public void compressFiles(List<File> fileList, CompressionStrategy compressionStrategy) {
        compressionStrategy.compresFiles(fileList);
    }
}
