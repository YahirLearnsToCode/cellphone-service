package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        CellPhone cellPhone = new CellPhone();

        CellPhone cellPhone1 = new CellPhone(); //exercise 2

        CellPhone cellphone2 = new CellPhone(242424245, "Iphone 16", "ATT", "3477557555", "Dave"); // exercise 3

        int serialNumber = setSerialNumber(myScanner);
        cellPhone.setSerialNumber(serialNumber);

        serialNumber = setSerialNumber(myScanner);  //exercise 2
        cellPhone1.setSerialNumber(serialNumber);  //exercise 2

        String model = setModel(myScanner);
        cellPhone.setModel(model);

        model = setModel(myScanner);  //exercise 2
        cellPhone1.setModel(model); //exercise 2

        String carrier = setCarrier(myScanner);
        cellPhone.setCarrier(carrier);

        carrier = setCarrier(myScanner); //exercise 2
        cellPhone1.setCarrier(carrier); //exercise 2

        String phoneNumber = setPhoneNumber(myScanner);
        cellPhone.setPhoneNumber(phoneNumber);

        phoneNumber = setPhoneNumber(myScanner); //exercise 2
        cellPhone1.setPhoneNumber(phoneNumber);  //exercise 2

        String owner = setOwner(myScanner);
        cellPhone.setOwner(owner);

        owner = setOwner(myScanner); //exercise 2
        cellPhone1.setOwner(owner); //exercise 2

        System.out.println(); //new line break

        //exercise 2
        display(cellPhone);
        display(cellPhone1);
        display(cellphone2); // exercise 3

        cellPhone.dial(cellPhone1.getPhoneNumber());
        cellPhone1.dial(cellPhone.getPhoneNumber());
        cellPhone1.dial(cellphone2.getPhoneNumber()); // exercise 3
    }

    //exercise 2
    private static void display(CellPhone cellPhone) {
        String infoMenu = "Serial No: " + cellPhone.getSerialNumber() + "\n"
                + "Model: " + cellPhone.getModel() + "\n"
                + "Carrier: " + cellPhone.getCarrier() + "\n"
                + "Phone Number: " + cellPhone.getPhoneNumber() + "\n"
                + "Owner: " + cellPhone.getOwner();

        System.out.println(infoMenu);
    }

    private static int setSerialNumber(Scanner myScanner) {
        System.out.print("What is the serial number? ");
        int serialNo = Integer.parseInt(myScanner.nextLine());

        return serialNo;
    }

    private static String setModel(Scanner myScanner) {
        System.out.print("What model is the phone? ");
        String model = myScanner.nextLine();

        return model;
    }

    private static String setCarrier(Scanner myScanner) {
        System.out.print("Who is the carrier? ");
        String carrier = myScanner.nextLine();

        return carrier;
    }

    private static String setPhoneNumber(Scanner myScanner) {
        System.out.print("What is the phone number? ");
        String phoneNo = myScanner.nextLine();

        return phoneNo;
    }

    private static String setOwner(Scanner myScanner) {
        System.out.print("Who is the owner of the Phone? ");
        String owner = myScanner.nextLine();

        return owner;
    }
}
