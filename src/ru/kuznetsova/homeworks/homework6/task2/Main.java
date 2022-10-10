package ru.kuznetsova.homeworks.homework6.task2;

import ru.kuznetsova.homeworks.homework6.task2.Product;
import ru.kuznetsova.homeworks.homework6.task2.MyProducts;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Картошка", 0, 20, 15, 300);
        Product product2 = new Product("суши", 10, 15, 15, 200);
        Product product3 = new Product("яблоко", 0, 0, 20, 10);

        MyProducts myProducts = new MyProducts();
        myProducts.addProduct(product1);
        myProducts.addProduct(product2);
        myProducts.addProduct(product3);
        myProducts.printProducts();


    }
}
