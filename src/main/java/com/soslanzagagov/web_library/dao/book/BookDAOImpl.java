package com.soslanzagagov.web_library.dao.book;

import com.soslanzagagov.web_library.entity.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookDAOImpl implements BookDAO {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public List<Book> getAllBooks() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Book", Book.class).getResultList();
    }

    @Override
    public Book getBook(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Book.class, id);
    }

    @Override
    public void saveBook(Book book) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(book);
    }

    @Override
    public void deleteBook(int id) {
        Session session = sessionFactory.getCurrentSession();
        Query<Book> query = session.createQuery("delete from Book where id =:bookId");
        query.setParameter("bookId", id);
        query.executeUpdate();
    }
}
