package ru.kuznetsova.homeworks.homework6.task1;

public class Mountain {
    private String name;
    private String country;
    private int height;

    public Mountain(String addMountain, String addCountry, int AddHeight){
        addMountain(name);
        addCountry(country);
        addHeight(height);
    }

    public void addMountain(String name){
        if (name.length() <= 4){
            throw new IllegalArgumentException("в имени должно быть не менее 4 символов");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addCountry(String country){
        if (country.length() <= 4){
            throw new IllegalArgumentException("в названии страны должно быть не менее 4 символов");
        }
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void addHeight(int height){
        if (height < 100){
            throw new IllegalArgumentException("Высота горы должна быть больше 100 метов");
        }
        this.height = height;
    }

    public int getHeight() {
        return height;
    }
}
