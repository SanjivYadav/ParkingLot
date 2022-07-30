package com.parkinglot.strategy.spotassignmentstrategy;

import com.parkinglot.model.*;

public class RandomSpotAssignmentStrategy implements SpotAssignmentStrategy{
    @Override
    public ParkingSpot assignSpot(ParkingLot parkingLot, ParkingSpotType parkingSpotType) {
        for(ParkingFloor parkingFloor : parkingLot.getFloors()){
            for(ParkingSpot parkingSpot : parkingFloor.getParkingSpots()){
                if(parkingSpot.getSpotStatus().equals(ParkingSpotStatus.AVAILABLE) &&
                            parkingSpotType.equals(parkingSpot.getSpotType())){
                    return parkingSpot;
                }
            }
        }
        return null;
    }
}
