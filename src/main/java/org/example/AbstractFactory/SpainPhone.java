package org.example.AbstractFactory;

record SpainPhone (String phone) implements Phone{
    @Override
    public String phone() {
        return String.format("+34 %s", phone);
    }
}
