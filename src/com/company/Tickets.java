package com.company;

public class Tickets {
    private int ticket_number;
    private int client_ID;
    private int flight_Number;
    private String ordered_Time;

    public Tickets(){
    }

    public int getTicket_number() {
        return ticket_number;
    }

    public void setTicket_number(int ticket_number) {
        this.ticket_number = ticket_number;
    }

    public int getClient_ID() {
        return client_ID;
    }

    public void setClient_ID(int client_ID) {
        this.client_ID = client_ID;
    }

    public int getFlight_Number() {
        return flight_Number;
    }

    public void setFlight_Number(int flight_Number) {
        this.flight_Number = flight_Number;
    }

    public String getOrdered_Time() {
        return ordered_Time;
    }

    public void setOrdered_Time(String ordered_Time) {
        this.ordered_Time = ordered_Time;
    }
}
