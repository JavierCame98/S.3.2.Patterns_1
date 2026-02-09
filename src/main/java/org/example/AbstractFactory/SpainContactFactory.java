package org.example.AbstractFactory;

public record SpainContactFactory (String street, String city, String zipCode, String phone) implements ContactFactory {

    @Override
    public Adress createAdress() {
        return new SpainAdress(street, city, zipCode);
    }

    @Override
    public Phone createPhone() {
        return new SpainPhone(phone);
    }
}
