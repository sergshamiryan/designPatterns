package org.example.creational.builder.sofarchandcleandesign.traditional;

public class ExpensiveComputerBuilder extends ComputerBuilder{
    @Override
    public void buildSystemBlock() {
        computer.setSystemBlock("System Block");
    }

    @Override
    public void buildDisplay() {
        computer.setDisplay("Display");
    }

    @Override
    public void buildManipulators() {
        computer.setManipulators("Manipulators");
    }
}
