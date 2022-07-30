package com.parkinglot.model;

import java.util.HashMap;
import java.util.Map;

public class DisplayBoard extends BaseModel{
    private Map<ParkingSpotType, Integer> displayBoard;

    public DisplayBoard(){
        displayBoard = new HashMap<>();
    }

    public Map<ParkingSpotType, Integer> getDisplayBoard() {
        return displayBoard;
    }

    public void updateDisplayBoard(ParkingSpotType spotType, int count) {
        this.displayBoard.put(spotType,count);
    }
}
