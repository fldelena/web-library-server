package com.soslanzagagov.springrest.controller;

import com.soslanzagagov.springrest.entity.Book;
import com.soslanzagagov.springrest.service.book.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyBookController {

    @Autowired
    BookService bookService;

    @GetMapping("/books")
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }

    @GetMapping("/books/{id}")
    public Book getBook(@PathVariable int id){
        return bookService.getBook(id);
    }

    @PostMapping("/books")
    public Book addBook(@RequestBody Book book){
        bookService.saveBook(book);
        return book;
    }

    @PutMapping("/books")
    public Book changeBook(@RequestBody Book book){
        bookService.saveBook(book);
        return book;
    }

    @DeleteMapping("/books/{id}")
    public String deleteBook(@PathVariable int id){
        return bookService.deleteBook(id);
    }
}
