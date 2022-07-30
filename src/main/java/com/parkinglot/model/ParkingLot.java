package com.parkinglot.model;

import java.util.List;

public class ParkingLot extends BaseModel{
    List<ParkingFloor> floors;
    List<ParkingGate> entryGates;
    List<ParkingGate> exitGates;
    private String address;

    public List<ParkingFloor> getFloors() {
        return floors;
    }

    public void setFloors(List<ParkingFloor> floors) {
        this.floors = floors;
    }

    public List<ParkingGate> getEntryGates() {
        return entryGates;
    }

    public void setEntryGates(List<ParkingGate> entryGates) {
        this.entryGates = entryGates;
    }

    public List<ParkingGate> getExitGates() {
        return exitGates;
    }

    public void setExitGates(List<ParkingGate> exitGates) {
        this.exitGates = exitGates;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
