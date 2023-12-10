package org.example.structural.adapter.problem1;

public class MaseratiVehicleKMHAdapter extends VehicleKMHAdapter {
    private static final String BRAND = "Maserati";

    public MaseratiVehicleKMHAdapter() {
        super(BRAND);
    }

    @Override
    public int speedKMH() {
        return (int) (200 * 1.6);
    }

}
