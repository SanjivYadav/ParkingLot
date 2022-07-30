package com.parkinglot.strategy.spotassignmentstrategy;

import com.parkinglot.model.ParkingLot;
import com.parkinglot.model.ParkingSpot;
import com.parkinglot.model.ParkingSpotType;

public interface SpotAssignmentStrategy {
    ParkingSpot assignSpot(ParkingLot parkingLot, ParkingSpotType parkingSpotType);
}
