package com.sda.springstarter.demo.controlers;

import com.sda.springstarter.demo.model.Author;
import com.sda.springstarter.demo.model.Book;
import com.sda.springstarter.demo.model.Category;
import com.sda.springstarter.demo.model.Publisher;
import com.sda.springstarter.demo.service.AuthorServiceImpl;
import com.sda.springstarter.demo.service.BookServiceImpl;
import com.sda.springstarter.demo.service.CategoryServiceImpl;
import com.sda.springstarter.demo.service.PublisherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// http://localhost:8080/books
@RestController
@RequestMapping("/books")
public class BookRestController {


    // ---------------------Books-----------------------
    @Autowired
    private BookServiceImpl bookService;

    @RequestMapping(value = "booksList", method = RequestMethod.GET)
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @RequestMapping(value = "booksList", method = RequestMethod.POST)
    public void saveBook(@RequestBody Book book) {
        bookService.saveBook(book);
    }

    @GetMapping(value = "{id}")
    public ResponseEntity<Book> getBookById(@PathVariable int id){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(bookService.getBookById(id));
    }


    // ------------------------Authors-------------------
    @Autowired
    private AuthorServiceImpl authorService;

    @RequestMapping(value = "authors", method = RequestMethod.GET)
    public List<Author> getAllAuthors() {
        return authorService.getAllAuthors();
    }

    @RequestMapping(value = "authors", method = RequestMethod.POST)
    public void saveAuthor(@RequestBody Author author) {
        authorService.saveAuthor(author);
    }


    // ------------------------Category-------------------
    @Autowired
    private CategoryServiceImpl categoryService;

    @RequestMapping(value = "categories", method = RequestMethod.GET)
    public List<Category> getAllCategories() {
        return categoryService.getAllCategory();
    }

    @RequestMapping(value = "categories", method = RequestMethod.POST)
    public void saveCategory(@RequestBody Category category) {
        categoryService.saveCategory(category);
    }


    // ------------------------Publishers-------------------
    @Autowired
    private PublisherServiceImpl publisherService;

    @RequestMapping(value = "publishers", method = RequestMethod.GET)
    public List<Publisher> getAllPublishers() {
        return publisherService.getAllPublishers();
    }

    @RequestMapping(value = "publishers", method = RequestMethod.POST)
    public void savePublisher(@RequestBody Publisher publisher) {
        publisherService.savePublisher(publisher);
    }

    @GetMapping(value = "getPublisher/{name}")
    public ResponseEntity<Publisher> getPublisherByName(@PathVariable String name){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(publisherService.getPublisherByName(name));
    }

}