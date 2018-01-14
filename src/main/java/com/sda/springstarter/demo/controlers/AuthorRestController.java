package com.sda.springstarter.demo.controlers;

import com.sda.springstarter.demo.model.Author;
import com.sda.springstarter.demo.model.Book;
import com.sda.springstarter.demo.service.AuthorServiceImpl;
import com.sda.springstarter.demo.service.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// http://localhost:8080/books
@RestController
@RequestMapping("/books")
public class BookRestController {

    @Autowired
    private BookServiceImpl bookService;

    @Autowired
    private AuthorServiceImpl authorService;

    // Books
    @RequestMapping(method = RequestMethod.GET)
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void saveBook(@RequestBody Book book) {
        bookService.saveBook(book);
    }

    // Authors
    @RequestMapping(method = RequestMethod.GET)
    public List<Author> getAllAuthors() {
        return authorService.getAllAuthors();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void saveAuthor(@RequestBody Author author) {
        authorService.saveAuthor(author);
    }


}
