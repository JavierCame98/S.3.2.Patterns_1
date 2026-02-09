package org.example.AbstractFactory;

public class SpainAdress implements Adress{
    private final String street;
    private final String zipCode;
    private final String city;

    public SpainAdress(String street, String zipCode, String city){
        this.street = street;
        this.zipCode = zipCode;
        this.city = city;
    }

    @Override
    public String adress() {
       return String.format("%s, %s, %s", street, zipCode, city);
    }
}
