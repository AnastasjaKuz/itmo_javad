package ru.kuznetsova.lessons.lesson6.books;

public class Book {
    // свойства
    private String title;
    private int pageCount;
    private Author author;
    // модификатор private позволяет обратиться к свойствам тольо из текущего класса


    // Конструктор есть в каждом классе
    public Book(){}

    public Book(String title){ // new Book("***")
        this.title = title;
    }

    public Book(String titile, Author author){
        this.title = title;
        setAuthor(author);
    }





    // методы, которые позворяют установить значения
    // private свойств - сеттеры
    public void setPageCount(int count ){
        if (count < 10){
            throw new IllegalArgumentException("Значение не может быть меньше 10");
        }
        pageCount = count;
    }


    // методы, которые позворяют возвратить значения
    // private свойств - геттеры
    public int getPageCount(){
        return pageCount;
    }


    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        if (author == null){
            throw new IllegalArgumentException("author не может быть null");
        }
        // this - ссылка на текущий объект
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pageCount=" + pageCount +
                ", author=" + author +
                '}';
    }
}
