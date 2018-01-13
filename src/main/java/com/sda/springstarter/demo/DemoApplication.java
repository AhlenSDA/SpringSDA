package com.sda.springstarter.demo;

import com.sda.springstarter.demo.model.Book;
import com.sda.springstarter.demo.model.Opinion;
import com.sda.springstarter.demo.model.Shop;
import com.sda.springstarter.demo.service.BookServiceImpl;
import com.sda.springstarter.demo.service.OpinionServiceImpl;
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

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

//        Book book1 = new Book("Title1", "Author1");
//        Book book2 = new Book("Title2", "Author2");
//
//        bookService.saveBook(book1);
//        bookService.saveBook(book2);
//
//        Shop shop1 = new Shop("Shop1", "Street1", "City1");
//        Shop shop2 = new Shop("Shop2", "Street2", "City2");
//
//        shopService.saveShop(shop1);
//        shopService.saveShop(shop2);
//
//        Opinion opinion1 = new Opinion(1, "Nick1", "Comment1");
//        Opinion opinion2 = new Opinion(1, "Nick2", "Comment2");
//        Opinion opinion3 = new Opinion(2, "Nick3", "Comment3");
//        Opinion opinion4 = new Opinion(2, "Nick4", "Comment4");
//
//        opinionService.saveOpinion(opinion1);
//        opinionService.saveOpinion(opinion2);
//        opinionService.saveOpinion(opinion3);
//        opinionService.saveOpinion(opinion4);

    }
}