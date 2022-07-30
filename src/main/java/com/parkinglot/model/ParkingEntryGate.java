package com.parkinglot.model;

public class ParkingEntryGate extends ParkingGate {
    private DisplayBoard displayBoard;

    public void setDisplayBoard(DisplayBoard displayBoard) {
        this.displayBoard = displayBoard;
    }

    public DisplayBoard getDisplayBoard() {
        return displayBoard;
    }
}
