package com.parkinglot.model;

public class Vehicle extends BaseModel{
    private int vehicle_no;
    private VehicleType vehicleType;

    public int getVehicle_no() {
        return vehicle_no;
    }

    public void setVehicle_no(int vehicle_no) {
        this.vehicle_no = vehicle_no;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
