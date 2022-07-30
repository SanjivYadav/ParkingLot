package com.parkinglot.model;

import java.util.Date;

public class Payment extends BaseModel{
    private String refrencenumber;
    private Invoice invoice;
    private PaymentStatus paymentStatus;
    private PaymentMode paymentMode;
    private Date paymentTime;

    public String getRefrencenumber() {
        return refrencenumber;
    }

    public void setRefrencenumber(String refrencenumber) {
        this.refrencenumber = refrencenumber;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }

    public Date getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }
}
