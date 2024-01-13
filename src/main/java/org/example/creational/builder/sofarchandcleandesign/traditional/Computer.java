package org.example.creational.builder.sofarchandcleandesign.traditional;

public class Computer {
    private String display;
    private String systemBlock;
    private String manipulators;

    public void setDisplay(final String display) {
        this.display = display;
    }

    public void setSystemBlock(final String systemBlock) {
        this.systemBlock = systemBlock;
    }

    public void setManipulators(final String manipulators) {
        this.manipulators = manipulators;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "display='" + display + '\'' +
                ", systemBlock='" + systemBlock + '\'' +
                ", manipulators='" + manipulators + '\'' +
                '}';
    }
}
