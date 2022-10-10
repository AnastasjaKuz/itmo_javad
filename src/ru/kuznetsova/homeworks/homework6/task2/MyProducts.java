package ru.kuznetsova.homeworks.homework6.task2;

public class MyProducts {
    private int maxProtein = 50;
    private int maxFat = 30;
    private int maxCarb = 20;
    private int maxCalories = 500;

    private int countOfProducts = 0;

    private Product[] myProducts = new Product[4];

    public void addProduct(Product product){
        if (product.getProtein() > maxProtein){
            System.out.println("Продукт" + product.getProductName() + "не подходит. Много белка");
        }
        if (product.getFat() > maxFat){
            System.out.println("Продукт" + product.getProductName() + "не подходит. Много жиров");
        }
        if (product.getCarb() > maxCarb){
            System.out.println("Продукт" + product.getProductName() + "не подходит. Много углеводов");
        }
        if (product.getCalories() > maxCalories){
            System.out.println("Продукт" + product.getProductName() + "не подходит. Много калорий");
        }
        myProducts[countOfProducts] = product;
        countOfProducts++;
    }


    public void printProducts(){
        System.out.println("Список продуктов:");
        for (Product product: myProducts){
            if (product == null) continue;
            System.out.println(product.getProductName());
        }
    }


}
