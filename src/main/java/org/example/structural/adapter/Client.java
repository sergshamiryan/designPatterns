package org.example.structural.adapter;

import org.example.structural.adapter.problem1.Maserati;
import org.example.structural.adapter.problem1.MaseratiVehicleKMHAdapter;
import org.example.structural.adapter.problem1.Vehicle;

public class Client {
    public static void main(String[] args) {
        Vehicle vehicleInMH = new Maserati();
        Vehicle vehicleInKMH = new MaseratiVehicleKMHAdapter();
        System.out.println(vehicleInMH);
        System.out.println(vehicleInKMH);
    }
}
