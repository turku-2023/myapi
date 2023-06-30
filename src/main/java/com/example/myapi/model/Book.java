package com.example.myapi.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "book")
public class Book {
    private long id;
    private String name;
    private String author;
    private String isbn;
 
    public Book() {
    }
 
    public Book(String name, String author, String isbn) {
         this.name = name;
         this.author = author;
         this.isbn = isbn;
    }
 
    @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
        public long getId() {
            return id;
        }
        public void setId(long id) {
            this.id = id;
        }
 
    @Column(name = "name", nullable = false)
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
 
    @Column(name = "author", nullable = false)
        public String getAuthor() {
            return author;
        }
        public void setAuthor(String author) {
            this.author = author;
        }
 
    @Column(name = "isbn", nullable = false)
        public String getIsbn() {
            return isbn;
        }
        public void setIsbn(String isbn) {
            this.isbn = isbn;
        }
}