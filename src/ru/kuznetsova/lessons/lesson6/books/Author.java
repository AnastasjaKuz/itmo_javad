package ru.kuznetsova.lessons.lesson6.books;

public class Author {
    // свойства, характеристики, поля, атрибуы
    // значения свойств по умолчанию
    // для ссылочных типов - null
    // для булевого - false
    // для целочисленного - 0
    // для чисел с плавающей точкой - 0.0

    public String name;
    public String surname;

    // объявление методов
    // МЕТОДЫ
    public void printFullName(){ // не возвращает в программу
        // тело медода
        // можно использовать return; для прерывания метода
        System.out.println(name + " " + surname);
    }

    public String getFullName(){
        // return - прерывает работу метода
        // возвращает результат работы метода
        return name + " " + surname;
    }


    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }


}
