package com.sda.springstarter.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Book {

    /**
     * In order to connect with H2 database type
     * in browser localhost:8080/h2-console
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String author;

    @ManyToOne
    private Author bookAuthor;

    @ManyToOne
    private Category bookCategory;

    @ManyToOne
    private Publisher bookPublisher;

    @OneToMany(mappedBy = "book")
    private List<Opinion> opinions;


    // no args constructor required by Spring and Hibernate
    public Book() {
    }

    public Book(String title, Author bookAuthor, Category bookCategory, Publisher bookPublisher) {
        this.title = title;
        this.bookAuthor = bookAuthor;
        this.bookCategory = bookCategory;
        this.bookPublisher = bookPublisher;
    }

    public Book(String title, String author, Author bookAuthor, Category bookCategory, Publisher bookPublisher, List<Opinion> opinions) {
        this.title = title;
        this.author = author;
        this.bookAuthor = bookAuthor;
        this.bookCategory = bookCategory;
        this.bookPublisher = bookPublisher;
        this.opinions = opinions;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Author getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(Author bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public Category getBookCategory() {
        return bookCategory;
    }

    public void setBookCategory(Category bookCategory) {
        this.bookCategory = bookCategory;
    }

    public Publisher getBookPublisher() {
        return bookPublisher;
    }

    public void setBookPublisher(Publisher bookPublisher) {
        this.bookPublisher = bookPublisher;
    }

    public List<Opinion> getOpinions() {
        return opinions;
    }

    public void setOpinions(List<Opinion> opinions) {
        this.opinions = opinions;
    }
}