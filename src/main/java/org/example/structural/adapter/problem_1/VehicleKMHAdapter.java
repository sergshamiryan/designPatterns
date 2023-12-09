package org.example.structural.adapter.problem_1;

import java.util.concurrent.Flow;

public abstract class VehicleKMHAdapter extends Vehicle
        implements VehicleAdapterService {

    public VehicleKMHAdapter(String brand) {
        super(brand);
    }




    public int getSpeed() {
        return speedKMH();
    }

    @Override
    public String toString() {
        return String.format(
                "%s  : %d + KMH",
                brand,
                getSpeed()
        );
    }
}
