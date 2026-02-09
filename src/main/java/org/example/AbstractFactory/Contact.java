package org.example.AbstractFactory;

public class Contact {

    private final Adress adress;
    private final Phone phone;

    public Contact (ContactFactory contactFactory){
        adress = contactFactory.createAdress();
        phone = contactFactory.createPhone();
    }

    @Override
    public String toString() {
        return String.format ("Adress: %s, Phone: %s", adress.adress(),phone.phone());
    }
}
