package org.example.AbstractFactory;

public record USAContactFactory (String street, String city, String zipcode, String phone) implements ContactFactory {

    @Override
    public Adress createAdress() {
        return new USAAdress(street, city, zipcode);
    }

    @Override
    public Phone createPhone() {
        return new USAPhone(phone);
    }
}
