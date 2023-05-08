package iAmDew.spring6webapp.services;

import iAmDew.spring6webapp.domain.Book;

public interface BookService {

    Iterable<Book> findAll();
}
