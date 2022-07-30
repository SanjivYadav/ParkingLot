package com.parkinglot.dtos;

import com.parkinglot.model.ParkingTicket;

public class CreateTicketResponseDTO {
    private ParkingTicket parkingTicket;
    private ResponseStatusDTO responseStatus;

    public ParkingTicket getParkingTicket() {
        return parkingTicket;
    }

    public void setParkingTicket(ParkingTicket parkingTicket) {
        this.parkingTicket = parkingTicket;
    }

    public ResponseStatusDTO getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(ResponseStatusDTO responseStatus) {
        this.responseStatus = responseStatus;
    }
}
