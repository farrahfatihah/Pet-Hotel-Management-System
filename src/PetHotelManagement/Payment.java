/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PetHotelManagement;
import java.util.Date;

/**
 *
 * @author frrah
 */
public class Payment {
    private String paymentId;
    private boolean hasPaid;
    private double amount;
    private Date date;
    
    public Payment(String paymentId, boolean hasPaid, double amount, Date date) {
        this.paymentId = paymentId;
        this.hasPaid = hasPaid;
        this.amount = amount;
        this.date = date;
    }
    
    public String getPaymentId() {
    return paymentId;
    }

    public void setPaymentId(String paymentId) {
    this.paymentId = paymentId;
    }

    public boolean getHasPaid() {
    return hasPaid;
    }

    public void setHasPaid(boolean hasPaid) {
    this.hasPaid = hasPaid;
    }

    public double getAmount() {
    return amount;
    }

    public void setAmount(double amount) {
    this.amount = amount;
    }

    public Date getDate() {
    return date;
    }

    public void setDate(Date date) {
    this.date = date;
    } 
}
