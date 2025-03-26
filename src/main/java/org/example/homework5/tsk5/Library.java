package org.example.homework5.tsk5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;

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
public class Library {
    private HashMap<String, Book> books = new HashMap<>();

    public void addBook(String isbn, Book book) {
        if (!books.containsKey(isbn)) {
            books.put(isbn, book);
        } else {
            System.out.println("дубликат isbn, книга не добавлена");
        }
    }
    public void removeBook(String isbn) {books.remove(isbn);}
    public ArrayList<Book> findBooksByAuthor(String author) {
        ArrayList<Book> booksByAuthor = new ArrayList<>(books.values());

        Iterator<Book> i = books.values().iterator();

        while (i.hasNext()) {
            Book book = i.next();
            if (Objects.equals(book.getAuthor(), author)) {
                booksByAuthor.add(book);
            }
        }
        return booksByAuthor;
    }

    public void setBooks(HashMap<String, Book> books) {this.books = books;}
    public HashMap<String, Book> getBooks() {return books;}
}
