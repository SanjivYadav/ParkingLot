package com.parkinglot.dtos;

import com.parkinglot.model.ParkingLot;

public class UpdateParkingLotResponseDTO {
    private ParkingLot parkingLot;
    private ResponseStatusDTO responseStatus;

    public ParkingLot getParkingLot() {
        return parkingLot;
    }

    public void setParkingLot(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    public ResponseStatusDTO getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(ResponseStatusDTO responseStatus) {
        this.responseStatus = responseStatus;
    }
}
