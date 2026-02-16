package org.example.AbstractFactory;

public record USAPhone (String phone) implements Phone{

    @Override
    public String phone(){
        return String.format("+1 %s", phone);
    }
}
