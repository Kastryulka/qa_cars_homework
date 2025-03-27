package org.example.homework5.tsk5;

/**
 * 5. Сложное+: Библиотека
 * Задача:
 * Реализуйте систему учета книг в библиотеке:
 * Класс Book (поля: title, author, year).
 * Класс Library с HashMap<String, Book> (ключ — ISBN книги).
 * Методы класса Library:
 * addBook(String isbn, Book book) — добавляет книгу.
 * removeBook(String isbn) — удаляет книгу.
 * findBooksByAuthor(String author) — возвращает ArrayList<Book> этого автора.
 * Доп. задание:
 * Добавьте проверку на дубликаты ISBN при добавлении книги
 */
public class Book {
    private String title, author;
    private int year; //год ИЗДАНИЯ

    public Book (String title, String author, int year) {
        setTitle(title);
        setAuthor(author);
        setYear(year);
    }

    public void setTitle(String title){this.title = title;}
    public void setAuthor(String author){this.author = author;}
    public void setYear(int year){this.year = year;}
    public String getTitle(){return title;}
    public String getAuthor(){return author;}
    public int getYear(){return year;}

    @Override
    public String toString() {
        return "{" + title + ", " + author + "}";
    }
}
