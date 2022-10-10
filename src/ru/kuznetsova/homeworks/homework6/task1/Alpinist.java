package ru.kuznetsova.homeworks.homework6.task1;

import ru.kuznetsova.lessons.lesson7.base.BattleUnit;

public class Alpinist {

    private String name;
    private String address;


    public Alpinist(String addName, String addAddress){
        addName(name);
        addAddress(address);
    }



    public void addName(String name){
        if (name.length() <= 3){
            throw new IllegalArgumentException("в имени должно быть не менее 3 символов");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addAddress(String address){
        if (address.length() <= 5){
            throw new IllegalArgumentException("address должен быть не менее 5 символов");
        }
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

}
