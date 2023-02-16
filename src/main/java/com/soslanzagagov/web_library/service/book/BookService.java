package com.soslanzagagov.web_library.service.book;

import com.soslanzagagov.web_library.entity.Book;

import java.util.List;

public interface BookService {

    List<Book> getAllBooks();

    Book getBook(int id);

    void saveBook(Book book);

    String deleteBook(int id);
}
