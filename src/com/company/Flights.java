package com.company;

public class Flights extends Airports{
    private int flight_Number;
    private String aircraft_Model;
    private String departure_Time;
    private String departure_From;
    private String arrival_In;
    private int flight_Duration;
    private int number_Of_Seats;

    public Flights(){
    }

    public int getFlight_Number() {
        return flight_Number;
    }

    public void setFlight_Number(int flight_Number) {
        this.flight_Number = flight_Number;
    }

    public String getAircraft_Model() {
        return aircraft_Model;
    }

    public void setAircraft_Model(String aircraft_Model) {
        this.aircraft_Model = aircraft_Model;
    }

    public String getDeparture_Time() {
        return departure_Time;
    }

    public void setDeparture_Time(String departure_Time) {
        this.departure_Time = departure_Time;
    }

    public String getDeparture_From() {
        return departure_From;
    }

    public void setDeparture_From(String departure_From) {
        this.departure_From = departure_From;
    }

    public String getArrival_In() {
        return arrival_In;
    }

    public void setArrival_In(String arrival_In) {
        this.arrival_In = arrival_In;
    }

    public int getFlight_Duration() {
        return flight_Duration;
    }

    public void setFlight_Duration(int flight_Duration) {
        this.flight_Duration = flight_Duration;
    }

    public int getNumber_Of_Seats() {
        return number_Of_Seats;
    }

    public void setNumber_Of_Seats(int number_Of_Seats) {
        this.number_Of_Seats = number_Of_Seats;
    }
}
