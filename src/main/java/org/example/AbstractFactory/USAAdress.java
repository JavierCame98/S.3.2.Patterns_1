package org.example.AbstractFactory;

public class USAAdress implements Adress{

    private final String street;
    private final String city;
    private final String zipcode;

    public USAAdress(String street, String city, String zipcode) {
        this.street = street;
        this.city = city;
        this.zipcode = zipcode;
    }

    @Override
    public String adress() {
        return String.format("%s, %s, NY %s", street,city,zipcode);
    }
}
