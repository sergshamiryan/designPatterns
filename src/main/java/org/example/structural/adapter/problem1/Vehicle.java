package org.example.structural.adapter.problem1;

public abstract class Vehicle {
    String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public abstract int getSpeed();

//    /*The problemIsSolved by adapter Pattern without adding this method
//    and without modifying any of these classes */
//    public int getSpeedKMH() {
//        return (int) (this.getSpeed() * 1.6);
//    }

    @Override
    public String toString() {
        return String.format(
                "%s  : %d + MPH",
                brand,
                getSpeed()
        );
    }
}
