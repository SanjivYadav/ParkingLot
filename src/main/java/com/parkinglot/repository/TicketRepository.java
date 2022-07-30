package com.parkinglot.repository;

import com.parkinglot.model.ParkingTicket;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class TicketRepository {

    private Map<Long, ParkingTicket> ticketRepository;
    private long lastCount;
    public TicketRepository(){
        ticketRepository = new HashMap<>();
    }


    public ParkingTicket save(ParkingTicket parkingTicket){
        this.lastCount += 1;
        ParkingTicket newParkingTicket = new ParkingTicket();
        newParkingTicket.setId(this.lastCount);
        newParkingTicket.setEntryTime(parkingTicket.getEntryTime());
        newParkingTicket.setEntryGate(parkingTicket.getEntryGate());
        newParkingTicket.setVehicle(parkingTicket.getVehicle());
        newParkingTicket.setSpot(parkingTicket.getSpot());
        ticketRepository.put(this.lastCount, newParkingTicket);
        return newParkingTicket;
    }

}
