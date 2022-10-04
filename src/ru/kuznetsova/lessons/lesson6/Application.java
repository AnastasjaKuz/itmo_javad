package ru.kuznetsova.lessons.lesson6;

import ru.kuznetsova.lessons.lesson6.books.Author;
import ru.kuznetsova.lessons.lesson6.books.Book;

// Полное имя класса: ru.kuznetsova.lessons.lesson6.Application
public class Application {
    public static void main(String[] args) {
        //  объект типа Author / экземпляр класса Author
        Author author1 = new Author();
        Author author2 = new Author();

        // обращение к свойствам осущесвляется через .
        author1.name = "Tom";
        author1.surname = "Crowed";

        System.out.println(author2.name); // null
        System.out.println(author2.surname); // null

        author2.name = "Matthew";
        author2.surname = "Crowley";

        System.out.println(author2.name);
        System.out.println(author2.surname);

        // Вызов метода
        author1.printFullName(); // void
        String fullName = author2.getFullName();

        System.out.println(fullName);

        Book book1 = new Book();
        book1.setPageCount(298);

        System.out.println(book1.getPageCount());

        System.out.println(book1);

        book1.setAuthor(author1);



    }
}
