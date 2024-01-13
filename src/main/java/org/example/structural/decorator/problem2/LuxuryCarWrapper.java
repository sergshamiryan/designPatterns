package org.example.structural.decorator.problem2;

public class LuxuryCarWrapper extends CarWrapper {

    public LuxuryCarWrapper(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adding Luxury car features");
    }
}
