package com.parkinglot.service;

import com.parkinglot.model.ParkingLot;
import com.parkinglot.repository.ParkingLotRepository;

public class ParkingLotService {
    private ParkingLotRepository parkingLotRepository;

    public ParkingLotService(ParkingLotRepository parkingLotRepository){
        this.parkingLotRepository = parkingLotRepository;
    }

    public ParkingLot createParkingLot(ParkingLot parkingLot){
        return parkingLotRepository.save(parkingLot);
    }

    public ParkingLot updateParkingLot(ParkingLot parkingLot) throws Exception {
        return parkingLotRepository.update(parkingLot);
    }
}
