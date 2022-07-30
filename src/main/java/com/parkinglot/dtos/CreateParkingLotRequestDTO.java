package com.parkinglot.dtos;

public class CreateParkingLotRequestDTO {
    private int noOffloors;
    private int noOfentryGates;
    private int noOfexitGates;
    private String address;

    public int getNoOffloors() {
        return noOffloors;
    }

    public void setNoOffloors(int noOffloors) {
        this.noOffloors = noOffloors;
    }

    public int getNoOfentryGates() {
        return noOfentryGates;
    }

    public void setNoOfentryGates(int noOfentryGates) {
        this.noOfentryGates = noOfentryGates;
    }

    public int getNoOfexitGates() {
        return noOfexitGates;
    }

    public void setNoOfexitGates(int noOfexitGates) {
        this.noOfexitGates = noOfexitGates;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
