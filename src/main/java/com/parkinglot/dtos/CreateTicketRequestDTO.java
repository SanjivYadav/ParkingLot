package com.parkinglot.dtos;

import com.parkinglot.model.ParkingEntryGate;
import com.parkinglot.model.ParkingSpotType;
import com.parkinglot.model.Vehicle;

public class CreateTicketRequestDTO {
    private Long parkingLotId;
    private Vehicle vehicle;
    private ParkingSpotType parkingSpotType;
    private ParkingEntryGate parkingEntryGate;

    public Long getParkingLotId() {
        return parkingLotId;
    }

    public void setParkingLotId(Long parkingLotId) {
        this.parkingLotId = parkingLotId;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ParkingSpotType getParkingSpotType() {
        return parkingSpotType;
    }

    public void setParkingSpotType(ParkingSpotType parkingSpotType) {
        this.parkingSpotType = parkingSpotType;
    }

    public ParkingEntryGate getParkingEntryGate() {
        return parkingEntryGate;
    }

    public void setParkingEntryGate(ParkingEntryGate parkingEntryGate) {
        this.parkingEntryGate = parkingEntryGate;
    }
}
