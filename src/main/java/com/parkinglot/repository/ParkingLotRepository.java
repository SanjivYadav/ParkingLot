package com.parkinglot.repository;

import com.parkinglot.model.ParkingLot;
import com.parkinglot.service.ParkingLotService;

import java.util.HashMap;
import java.util.Map;

public class ParkingLotRepository {
    Map<Long, ParkingLot> repository;
    private long lastCount;

    public ParkingLotRepository(){
        repository = new HashMap<>();
        this.lastCount =0;
    }
    public ParkingLot save(ParkingLot parkingLot){
        this.lastCount += 1;
        parkingLot.setId(this.lastCount);
        repository.put(lastCount, parkingLot);
        return parkingLot;
    }

    public ParkingLot update(ParkingLot parkingLot) throws Exception {
        if(!repository.containsKey(parkingLot.getId()))
            throw new Exception("Unable to update the parking lot");
        ParkingLot parkingLot1 = repository.get(parkingLot.getId());
        parkingLot1.setAddress(parkingLot.getAddress());
        repository.put(parkingLot1.getId(), parkingLot1);
        return parkingLot1;
    }

    public ParkingLot getById(Long id){
        return this.repository.get(id);
    }
}
