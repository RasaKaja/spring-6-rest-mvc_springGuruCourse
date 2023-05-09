package iAmDew.spring6webapp.services;

import iAmDew.spring6webapp.domain.Author;

public interface AuthorService {

    Iterable<Author> findAll();
}
