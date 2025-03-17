package org.example.homework4;

import java.util.Arrays;
import java.util.Objects;

/// Создайте класс Library с массивом книг (String[] books).
/// Добавьте методы addBook(String book), removeBook(String book), displayBooks().
/// В main добавьте книги, удалите одну и выведите оставшиеся.
public class Library {
    private String[] books;
    private int booksCount = 0;

    public Library() {this.books = new String[1];}
    public Library(String[] books) {setBooks(books);}

    public void addBook(String book) {
        if (!Objects.isNull(book) && !Arrays.asList(books).contains(book)) {
            if (booksCount == books.length) {
                this.books = Arrays.copyOf(this.books, books.length + 1);
                this.books[books.length - 1] = book;
            } else if (booksCount == 0) {
                this.books[0] = book;
            } else {
                this.books[booksCount - 1] = book;
            }

            System.out.println("добавлена книга - " + book);
            this.displayBooks();
            booksCount++;
        }
        else {
            System.out.println("книга уже есть в библиотеке");
        }
    };

    public void removeBook(String book) {
        if (!Objects.isNull(book) && Arrays.asList(books).contains(book)) {
            int indexOfBook = Arrays.asList(books).indexOf(book);
            System.arraycopy(this.books, indexOfBook+1, this.books, indexOfBook, books.length-indexOfBook-1);
            this.books = Arrays.copyOf(this.books, books.length-1);
            System.out.println("удалена книга - " + book);
            this.displayBooks();
            booksCount--;
        }
        else {
            System.out.println("книга не найдена");
        }
    };

    public void displayBooks() {
        System.out.println("список книг в библиотеке: " + Arrays.toString(books)
            .replaceAll("[\\[\\]]", "")
            .replaceAll("null", "незнакомая книга"));
    }

    public void setBooks(String[] books) {
        if (!Objects.isNull(books) && books.length > 0) {
            this.books = Arrays.copyOf(books, books.length);
        }
        else {
            System.out.println("указано некорректное значение, книги не сохранены");
            this.books = new String[1];
        }
    }
    public String[] getBooks() {
        return this.books;
    }
}