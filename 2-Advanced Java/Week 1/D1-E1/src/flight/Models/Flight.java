package flight.Models;

import java.time.LocalDate;

public class Flight {
    private String name;
    private String destination;
    private LocalDate date;
    private int bookedSeats;

    public Flight(String name, String destination, LocalDate date, int bookedSeats) {
        this.name = name;
        this.destination = destination;
        this.date = date;
        this.bookedSeats = bookedSeats;
    }
    public Flight(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getBookedSeats() {
        return bookedSeats;
    }

    public void setBookedSeats(int bookedSeats) {
        this.bookedSeats = bookedSeats;
    }

    public String getFlightDetails() {
        return "Name: " + name + ", Destination: " + destination + ", Date: " + date + ", Booked Seats: " + bookedSeats;
    }

    public boolean checkAvailability() {
        return bookedSeats < 100;
    }

    public void incrementBookingCounter() {
        bookedSeats++;
    }
}
