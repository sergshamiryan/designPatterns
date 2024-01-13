package org.example.structural.decorator.problem2;

public class SportCarWrapper extends CarWrapper {

    public SportCarWrapper(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adding Sport car features");
    }
}
