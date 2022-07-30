package com.parkinglot.model;

public class ParkingSpot extends BaseModel{
    private int spot_number;
    private ParkingSpotType spotType;
    private ParkingSpotStatus spotStatus;
    private ParkingFloor floor;

    public int getSpot_number() {
        return spot_number;
    }

    public void setSpot_number(int spot_number) {
        this.spot_number = spot_number;
    }

    public ParkingSpotType getSpotType() {
        return spotType;
    }

    public void setSpotType(ParkingSpotType spotType) {
        this.spotType = spotType;
    }

    public ParkingSpotStatus getSpotStatus() {
        return spotStatus;
    }

    public void setSpotStatus(ParkingSpotStatus spotStatus) {
        this.spotStatus = spotStatus;
    }

    public ParkingFloor getFloor() {
        return floor;
    }

    public void setFloor(ParkingFloor floor) {
        this.floor = floor;
    }
}
