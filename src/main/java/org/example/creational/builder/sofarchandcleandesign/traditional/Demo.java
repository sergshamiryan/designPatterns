package org.example.creational.builder.sofarchandcleandesign.traditional;

public class Demo {
    public static void main(String[] args) {
        ComputerDirector director = new ComputerDirector(new ExpensiveComputerBuilder());
        director.setComputerBuilder(new ExpensiveComputerBuilder());
        director.buildComputer();
        System.out.println(director.getComputer());
    }
}
