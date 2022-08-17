package main;

import data.Address;
import data.Manager;

public class Implementation {
    public static void main(String[] args) {
        Address address = new Address();
        Manager obj = new Manager("Rohit","20 Nov",20,50000,address,5,10);

        address.setHouseNumber(111);
        address.setCity("Nagpur");
        address.setCountry("INDIA");
        address.setStreetName("Road");
        address.setZipCode(440026);

        obj.setAddress(address);
        obj.show();
        System.out.println("obj.calculateIncrement() = $" + obj.calculateIncrement());

    }
}
