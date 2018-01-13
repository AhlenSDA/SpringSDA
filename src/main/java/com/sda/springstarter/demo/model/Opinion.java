package com.sda.springstarter.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Opinion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long id_book;
    private String nick;
    private String comment;

    @ManyToOne
    @JoinColumn(name = "id_book", nullable = false, insertable = false, updatable = false)
    private Book book;

    public Opinion() {
    }

    public Opinion(long id_book, String nick, String comment) {
        this.id_book = id_book;
        this.nick = nick;
        this.comment = comment;
    }

    public long getId_book() {
        return id_book;
    }

    public void setId_book(long id_book) {
        this.id_book = id_book;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}