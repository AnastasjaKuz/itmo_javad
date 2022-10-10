package ru.kuznetsova.homeworks.homework6.Task3;

public class Main {
    public static void main(String[] args) {
        Cat kuzya = new Cat("Кузя", 6, 10);
        Cat barsik = new Cat("Барсик", 5, 7);

        Mouse mouse1 = new Mouse(2);
        Mouse mouse2 = new Mouse(4);
        Mouse mouse3 = new Mouse(5);
        Mouse mouse4 = new Mouse(3);
        Mouse mouse5 = new Mouse(7);

        kuzya.catchMouse(mouse1);
        kuzya.catchMouse(mouse3);

        barsik.catchMouse(mouse2);
        barsik.catchMouse(mouse4);
        barsik.catchMouse(mouse5);

        kuzya.attackAnotherCat(barsik);
        kuzya.printMice();
        barsik.printMice();
    }
}
