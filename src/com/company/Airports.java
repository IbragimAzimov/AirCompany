package com.company;

public class Airports extends Countries {
    private String airport_ID;
    private String city;
    private String airport_Name;

    public Airports() {
    }

    public String getAirport_ID() {
        return airport_ID;
    }

    public void setAirport_ID(String airport_ID) {
        this.airport_ID = airport_ID;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAirport_Name() {
        return airport_Name;
    }

    public void setAirport_Name(String airport_Name) {
        this.airport_Name = airport_Name;
    }
}
