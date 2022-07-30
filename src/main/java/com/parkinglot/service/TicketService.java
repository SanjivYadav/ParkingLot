package com.parkinglot.service;

import com.parkinglot.model.*;
import com.parkinglot.repository.ParkingLotRepository;
import com.parkinglot.repository.TicketRepository;
import com.parkinglot.strategy.spotassignmentstrategy.SpotAssignmentStrategy;

import java.util.Date;

public class TicketService {

    private TicketRepository ticketRepository;
    private SpotAssignmentStrategy spotAssignmentStrategy;
    private ParkingLotRepository parkingLotRepository;
    public TicketService(TicketRepository ticketRepository, ParkingLotRepository parkingLotRepository,
                         SpotAssignmentStrategy assignmentStrategy){
        this.ticketRepository = ticketRepository;
        this.parkingLotRepository = parkingLotRepository;
        this.spotAssignmentStrategy = assignmentStrategy;

    }

    public ParkingTicket createTicket(Long parkingLotId, Vehicle vehicle, ParkingSpotType spotType,
                                      ParkingEntryGate entryGate){
        ParkingLot parkingLot = parkingLotRepository.getById(parkingLotId);
        ParkingSpot parkingSpot = spotAssignmentStrategy.assignSpot(parkingLot,spotType);

        if(parkingSpot == null)
            return null;
        ParkingTicket parkingTicket = new ParkingTicket();
        parkingTicket.setSpot(parkingSpot);
        parkingTicket.setVehicle(vehicle);
        parkingTicket.setEntryGate(entryGate);
        parkingTicket.setOperator(new PlOperator());
        parkingTicket.setEntryTime(new Date());
        return ticketRepository.save(parkingTicket);
    }
}
