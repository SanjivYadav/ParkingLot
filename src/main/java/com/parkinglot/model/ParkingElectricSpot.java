package com.parkinglot.model;

public class ParkingElectricSpot extends ParkingSpot {
    private ElectricCharger electricCharger;

    public ParkingElectricSpot(ElectricCharger electricCharger) {
        this.electricCharger = electricCharger;
    }

    public ElectricCharger getElectricCharger() {
        return electricCharger;
    }
}
