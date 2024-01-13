package org.example.structural.decorator.problem2;

public class CarWrapper  implements Car {
    protected final Car car;

    public CarWrapper(Car car) {
        this.car = car;
    }

    @Override
    public void assemble() {
       car.assemble();
    }
}
