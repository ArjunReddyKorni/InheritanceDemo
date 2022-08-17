package main;

import data.Address;
import data.Manager;

public class Implementation {
    public static void main(String[] args) {
        Manager obj = new Manager();
        obj.setName("Rohit");
        obj.setTeamRatings(5);
        obj.setTeamSize(5);
        obj.setAge(20);
        obj.setDob("20 Nov");
        obj.setSalary(50000);

        Address address = new Address();
        address.setHouseNumber(111);
        address.setCity("Nagpur");
        address.setCountry("INDIA");
        address.setStreetName("Road");
        address.setZipCode(440026);

        obj.setAddress(address);
        obj.show();

    }
}
