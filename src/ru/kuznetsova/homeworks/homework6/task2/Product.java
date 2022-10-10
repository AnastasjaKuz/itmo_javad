package ru.kuznetsova.homeworks.homework6.task2;

public class Product {
    private String productName;
    private int protein;
    private int fat;
    private int carb;
    private int calories;


    public Product(String productName, int protein, int fat, int carb, int calories){
        setProductName(productName);
        setProtein(protein);
        setFat(fat);
        setCarb(carb);
        setCalories(calories);
    }


    public void setProductName(String productName){
        this.productName = productName;
    }

    public void setProtein(int protein){
        if (protein < 1){
            throw new IllegalArgumentException("protein не может быть меньше 1");
        }
        this.protein = protein;
    }

    public void setFat(int fat){
        if (fat < 1){
            throw new IllegalArgumentException("fat не может быть меньше 1");
        }
        this.fat = fat;
    }

    public void setCarb(int carb){
        if (carb < 1){
            throw new IllegalArgumentException("carb не может быть меньше 1");
        }
        this.carb = carb;
    }

    public void setCalories(int calories){
        if (calories < 1){
            throw new IllegalArgumentException("calories не может быть меньше 1");
        }
        this.calories = calories;
    }

    public String getProductName() {
        return productName;
    }

    public int getProtein() {
        return protein;
    }

    public int getFat() {
        return fat;
    }

    public int getCarb() {
        return carb;
    }

    public int getCalories() {
        return calories;
    }
}
