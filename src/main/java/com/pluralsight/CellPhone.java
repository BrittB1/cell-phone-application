package com.pluralsight;

public class CellPhone {
private int serialNumber;
private String model;
private String carrier;
private String phoneNumber;
private String owner;

// beginning of the constructor. runs when creating a new object and sets the initial values
    public CellPhone(){

        // 'this' refers to the current object being created
        this.serialNumber = 0;
        this.model = "";
        this.carrier = "";
        this.phoneNumber = "";
        this.owner = "";
    }
    // start of getters, which let us read (get) the value of a private property
    public int getSerialNumber() {
        return this.serialNumber;
    }

    public String getModel() {
        return this.model;
    }

    public String getCarrier() {
        return this.carrier;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public String getOwner() {
        return owner;
    }
}