package com.parkinglot.model;

import java.util.Date;

public class Invoice extends BaseModel{
    private double amount;
    private InvoicePaidStatus invoicePaidStatus;
    private PlOperator invoiceGeneratedBy;
    private ParkingTicket parkingTicket;
    private Date exitTime;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public InvoicePaidStatus getInvoicePaidStatus() {
        return invoicePaidStatus;
    }

    public void setInvoicePaidStatus(InvoicePaidStatus invoicePaidStatus) {
        this.invoicePaidStatus = invoicePaidStatus;
    }

    public PlOperator getInvoiceGeneratedBy() {
        return invoiceGeneratedBy;
    }

    public void setInvoiceGeneratedBy(PlOperator invoiceGeneratedBy) {
        this.invoiceGeneratedBy = invoiceGeneratedBy;
    }

    public ParkingTicket getParkingTicket() {
        return parkingTicket;
    }

    public void setParkingTicket(ParkingTicket parkingTicket) {
        this.parkingTicket = parkingTicket;
    }

    public Date getExitTime() {
        return exitTime;
    }

    public void setExitTime(Date exitTime) {
        this.exitTime = exitTime;
    }
}
