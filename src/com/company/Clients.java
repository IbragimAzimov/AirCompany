package com.company;

public class Clients {
    private int client_ID;
    private String passport_ID;
    private String client_Name;
    private String gender;
    private String country;

    public Clients(){
    }

    public int getClient_ID() {
        return client_ID;
    }

    public void setClient_ID(int client_ID) {
        this.client_ID = client_ID;
    }

    public String getPassport_ID() {
        return passport_ID;
    }

    public void setPassport_ID(String passport_ID) {
        this.passport_ID = passport_ID;
    }

    public String getClient_Name() {
        return client_Name;
    }

    public void setClient_Name(String client_Name) {
        this.client_Name = client_Name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
