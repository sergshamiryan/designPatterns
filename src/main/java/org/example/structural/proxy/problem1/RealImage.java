package org.example.structural.proxy.problem1;

public class RealImage implements Image {

    private final String fileName;

    public RealImage(String fileName) {
        loadFromDisk();
        this.fileName = fileName;
    }

    @Override
    public void display() {
        System.out.printf(
                "Displaying the image with fileName %s\n",
                this.fileName);
    }

    public void loadFromDisk() {
        System.out.printf(
                "Loading form Disk the image with fileName %s\n",
                this.fileName);
    }
}
