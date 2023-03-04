package pro.sky.java.course1.homework13;

public class Book {
    private String title;
    private Author author;
    private int year;
    public Book(String title, Author author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}


/*
Создайте класс Book, который содержит в себе данные о названии, авторе и годе публикации книги. Типы полей должны быть String, Author (его мы создадим в п. 2) и int.
Создайте класс Author, который содержит в себе данные об имени и фамилии автора.
Напишите конструкторы для обоих классов, заполняющие все поля.
Создайте геттеры для всех полей автора и всех полей книги.
Создайте сеттер для поля «Год публикации» у книги.
В методе main создайте несколько объектов «Книга» (достаточно двух) и несколько объектов «Автор» (достаточно тоже двух) и инициализируйте их.
Учтите, что авторы являются обязательными и книги не могут создаваться без авторов.
Метод main не должен находиться в классах Book и Author.

Создайте отдельный класс для запуска приложения и объявите метод main в нем.

В том же методе main измените год публикации одной из книг с помощью сеттера.
 */