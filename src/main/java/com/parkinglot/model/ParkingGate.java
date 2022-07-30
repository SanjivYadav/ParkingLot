package com.parkinglot.model;

public abstract class ParkingGate extends BaseModel {
    private int number;
    private PlOperator operator;
    private ParkingGateType gateType;
    private ParkignGateStatus gateStatus;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public PlOperator getOperator() {
        return operator;
    }

    public void setOperator(PlOperator operator) {
        this.operator = operator;
    }

    public ParkingGateType getGateType() {
        return gateType;
    }

    public void setGateType(ParkingGateType gateType) {
        this.gateType = gateType;
    }

    public ParkignGateStatus getGateStatus() {
        return gateStatus;
    }

    public void setGateStatus(ParkignGateStatus gateStatus) {
        this.gateStatus = gateStatus;
    }
}
