package data;

public class Address {
    private int houseNumber;
    private String streetName;
    private String city;
    private String country;
    private int zipCode;

   public void display() {
       System.out.println("Address Details");
       System.out.println("houseNumber = " + houseNumber);
       System.out.println("streetName = " + streetName);
       System.out.println("city = " + city);
       System.out.println("country = " + country);
       System.out.println("zipCode = " + zipCode);

   }
    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }
}
