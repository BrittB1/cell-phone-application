package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApp {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        CellPhone myPhone = new CellPhone();  // instantiating new cell phone object

        display(myPhone);

        CellPhone otherPhone = new CellPhone();
        otherPhone.setSerialNumber(788);
        otherPhone.setPhoneNumber("411");
        otherPhone.setCarrier("Verizon");
        otherPhone.setOwner("Florida Wildlife Commission");
        otherPhone.setModel("Landline");

        display(otherPhone);

        CellPhone thirdPhone = new CellPhone (12345,"Motorola", "Verizon" ,"555-4444","Billy");

        display(thirdPhone); // since display() is static, we can call it directly w/o needing an object

        myPhone.dial(thirdPhone.getPhoneNumber());

        System.out.print("What is the serial number?: ");
        int serial = keyboard.nextInt(); // nextInt grabs the number entered, then program asks for model but doesn't wait for it to be entered
        keyboard.nextLine(); // cleans up leftover 'enter' so program waits for input

        System.out.print("What is the phone's model?: ");
        String model = keyboard.nextLine();

        System.out.print("Who is the service carrier?: ");
        String carrier = keyboard.nextLine();

        System.out.print("What is the phone number?: ");
        String phoneNum = keyboard.nextLine();

        System.out.print("Who is the owner of the phone?: ");
        String owner = keyboard.nextLine();

        myPhone.setSerialNumber(serial); //using setter to store the user's entered information
        myPhone.setModel(model);
        myPhone.setCarrier(carrier);
        myPhone.setPhoneNumber(phoneNum);
        myPhone.setOwner(owner);

        display(myPhone);

        myPhone.dial(otherPhone.getPhoneNumber());

    }
    public static void display(CellPhone phone) {
        System.out.println("\nPhone Information:");
        System.out.println("Serial Number: " + phone.getSerialNumber());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Owner: " + phone.getOwner());
        System.out.println("Phone Number: " + phone.getPhoneNumber());
    }
}
