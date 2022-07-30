package com.parkinglot.model;

import java.util.Date;

public class Ticket extends BaseModel{
    private Vehicle vehicle;
    private Spot spot;
    private PlOperator operator;
    private Payment payment;
    private Date entryTime;
    private Gate entryGate;

}
