package com.soslanzagagov.web_library.service.book;

import com.soslanzagagov.web_library.dao.book.BookDAO;
import com.soslanzagagov.web_library.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    BookDAO bookDAO;

    @Override
    @Transactional
    public List<Book> getAllBooks() {
        return bookDAO.getAllBooks();
    }

    @Override
    @Transactional
    public Book getBook(int id) {
        Book book = bookDAO.getBook(id);
        if (book == null){
            throw null; // todo
        }
        return book;
    }

    @Override
    @Transactional
    public void saveBook(Book book) {
        bookDAO.saveBook(book);
    }

    @Override
    @Transactional
    public String deleteBook(int id) {
        Book book = bookDAO.getBook(id);
        if (book == null){
            throw null; // todo
        }
        bookDAO.deleteBook(id);
        return "Удалено";
    }
}
