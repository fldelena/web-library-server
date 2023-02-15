package com.soslanzagagov.springrest.dao.book;

import com.soslanzagagov.springrest.entity.Book;

import java.util.List;

public interface BookDAO {

    List<Book> getAllBooks();

    Book getBook(int id);

    void saveBook(Book book);

    void deleteBook(int id);
}
