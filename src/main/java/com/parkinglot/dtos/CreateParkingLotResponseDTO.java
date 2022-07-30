package com.parkinglot.dtos;

import com.parkinglot.model.ParkingLot;

public class CreateParkingLotResponseDTO {
    private ParkingLot parkingLot;
    private ResponseStatusDTO responseStatusDTO;

    public ParkingLot getParkingLot() {
        return parkingLot;
    }

    public void setParkingLot(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    public ResponseStatusDTO getResponseStatusDTO() {
        return responseStatusDTO;
    }

    public void setResponseStatusDTO(ResponseStatusDTO responseStatusDTO) {
        this.responseStatusDTO = responseStatusDTO;
    }
}
