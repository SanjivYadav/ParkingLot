package com.parkinglot.controller;

import com.parkinglot.dtos.CreateTicketRequestDTO;
import com.parkinglot.dtos.CreateTicketResponseDTO;
import com.parkinglot.dtos.ResponseStatusDTO;
import com.parkinglot.model.ParkingTicket;
import com.parkinglot.service.TicketService;

public class TicketController {
    TicketService ticketService;
    public TicketController(TicketService ticketService){
        this.ticketService = ticketService;
    }

    public CreateTicketResponseDTO createTicket(CreateTicketRequestDTO request){
        ParkingTicket createdParkingTicket =  ticketService.createTicket(request.getParkingLotId(),request.getVehicle(),
                request.getParkingSpotType(),request.getParkingEntryGate());

        if(createdParkingTicket == null){
            CreateTicketResponseDTO responseDTO = new CreateTicketResponseDTO();
            responseDTO.setResponseStatus(ResponseStatusDTO.FAILED);
            return responseDTO;
        }

        CreateTicketResponseDTO responseDTO = new CreateTicketResponseDTO();
        responseDTO.setResponseStatus(ResponseStatusDTO.SUCCESS);
        responseDTO.setParkingTicket(createdParkingTicket);
        return  responseDTO;
    }
}
