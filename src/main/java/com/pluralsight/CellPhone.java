package com.pluralsight;

// our properties, pieces of information every cellphone has
public class CellPhone {
private int serialNumber;
private String model;
private String carrier;
private String phoneNumber;
private String owner;

// beginning of the constructor. runs when creating a new object and sets the initial values
// Like when a phone comes from a factory; it has default settings before being customized
    public CellPhone() {
        this.serialNumber = 0; // 'this' refers to the current object being created. 'serialNumber' is the property we're setting
        this.model = "";
        this.carrier = "";
        this.phoneNumber = "";
        this.owner = "";
    }

    public void dial(String phoneNumber) {
        System.out.println(getOwner() + "'s phone is calling" + phoneNumber);
    }
    public int getSerialNumber() { // start of getters, which let us read (get) the value of a private property.
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


    public String getOwner() { //start of setters
        return owner;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}