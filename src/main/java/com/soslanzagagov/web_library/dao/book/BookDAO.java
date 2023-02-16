package com.soslanzagagov.web_library.dao.book;

import com.soslanzagagov.web_library.entity.Book;

import java.util.List;

public interface BookDAO {

    List<Book> getAllBooks();

    Book getBook(int id);

    void saveBook(Book book);

    void deleteBook(int id);
}
