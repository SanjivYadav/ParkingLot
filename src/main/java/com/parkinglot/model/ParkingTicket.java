package com.parkinglot.model;

import java.util.Date;

public class ParkingTicket extends BaseModel{
    private Vehicle vehicle;
    private ParkingSpot spot;
    private PlOperator operator;
    private Date entryTime;
    private ParkingGate entryGate;

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ParkingSpot getSpot() {
        return spot;
    }

    public void setSpot(ParkingSpot spot) {
        this.spot = spot;
    }

    public PlOperator getOperator() {
        return operator;
    }

    public void setOperator(PlOperator operator) {
        this.operator = operator;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public ParkingGate getEntryGate() {
        return entryGate;
    }

    public void setEntryGate(ParkingGate entryGate) {
        this.entryGate = entryGate;
    }
}
