package com.parkinglot.model;

import java.util.ArrayList;
import java.util.List;

public class ParkingFloor extends BaseModel{
    private List<ParkingSpot> parkingSpots;
    private int floorNumber;

    public ParkingFloor(){
        this.parkingSpots = new ArrayList<>();
    }

    public List<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }

    public void setParkingSpot(ParkingSpot parkingSpots) {
        this.parkingSpots.add(parkingSpots);
    }

    public void addParkingSpots(List<ParkingSpot> parkingSpots) {
        this.parkingSpots.addAll(parkingSpots);
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }
}
