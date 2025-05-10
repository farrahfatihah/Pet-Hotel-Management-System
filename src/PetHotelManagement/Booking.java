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
public class Booking {
    private String bookingId;
    private Room room;
    private Date checkInDate;
    private Date checkOutDate;
    private Payment payment;
    private double ratePerNight = 30.0;
    
    public Booking(String bookingId, Room room, Date checkInDate, Date checkOutDate) {
        this.bookingId = bookingId;
        this.room = room;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }
    
    public String getBookingId() {
        return bookingId;
    }
    
    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }
    
    public Date getCheckInDate() {
        return checkInDate;
    }
    
    public void setCheckInDate(Date checkInDate) {
        this.checkInDate = checkInDate;
    }
    
    public Date setCheckOutDate() {
        return checkOutDate;
    }
    
    public void setCheckOutDate(Date checkOutDate) {
        this.checkOutDate = checkOutDate;
    }
    
    public double getTotalCost() {
        long milliseconds = checkOutDate.getTime() - checkInDate.getTime();
        long days = milliseconds / (1000 * 60 * 60 * 24);
        return days * ratePerNight;
    }
    
    public Payment getPayment() {
        return payment;
    }
    
    public void setPayment(Payment payment) {
        this.payment = payment;
    }
}
