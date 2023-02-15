package com.soslanzagagov.springrest.service.book;

import com.soslanzagagov.springrest.entity.Book;

import java.util.List;

public interface BookService {

    List<Book> getAllBooks();

    Book getBook(int id);

    void saveBook(Book book);

    String deleteBook(int id);
}
