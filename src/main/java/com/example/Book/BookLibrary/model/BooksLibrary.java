package com.example.Book.BookLibrary.model;

import jakarta.persistence.*;


@Entity
public class BooksLibrary {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column  (nullable = false, updatable =false)
    private int id;

    private String title;

    private String author;

    // International Standard Book Number (ISBN)
    @Column  (nullable = false, updatable = false)
    private String isbn;



    public BooksLibrary (int id, String title, String author, String isbn){
        this.id = id;
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public BooksLibrary(){

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "BooksLibrary{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}
