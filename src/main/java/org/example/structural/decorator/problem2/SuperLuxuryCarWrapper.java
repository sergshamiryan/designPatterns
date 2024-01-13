package org.example.structural.decorator.problem2;

public class SuperLuxuryCarWrapper extends LuxuryCarWrapper {

    public SuperLuxuryCarWrapper(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adding Super Luxury car features");
    }
}
