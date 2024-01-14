package org.example.behavioural.strategy.sofarchandcleandesign;

import java.util.List;

@FunctionalInterface
public interface CompressionStrategy {
    void compresFiles(List<File> files);
}
