package com.sda.springstarter.demo;

import com.sda.springstarter.demo.model.Author;
import com.sda.springstarter.demo.model.Book;
import com.sda.springstarter.demo.repository.AuthorRepository;
import com.sda.springstarter.demo.service.AuthorServiceImpl;
import com.sda.springstarter.demo.service.BookServiceImpl;
import com.sda.springstarter.demo.service.CategoryServiceImpl;
import com.sda.springstarter.demo.service.OpinionServiceImpl;
import com.sda.springstarter.demo.service.PublisherServiceImpl;
import com.sda.springstarter.demo.service.ShopServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    @Autowired
    private BookServiceImpl bookService;

    @Autowired
    private ShopServiceImpl shopService;

    @Autowired
    private OpinionServiceImpl opinionService;

    @Autowired
    private PublisherServiceImpl publisherService;

    @Autowired
    private CategoryServiceImpl categoryService;

    @Autowired
    private AuthorServiceImpl authorService;

    @Autowired
    private AuthorRepository authorRepository;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {


//    Author author = authorRepository.findById(2);
//
//    Book book = new Book();
//    book.setTitle("Java dla idiotow");
//    book.setBookAuthor(author);
//
//    bookService.saveBook(book);


    }
}