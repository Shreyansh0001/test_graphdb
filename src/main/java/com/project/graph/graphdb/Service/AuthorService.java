package com.project.graph.graphdb.Service;

import com.project.graph.graphdb.Model.Author;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface AuthorService {

    public List getAll();
    public Author saveAuthor(Author author);

    public Optional<Author> getAuthorById(Long id);

    public void deleteAuthor(Long id);

    public void deleteAllAuthors();

    public Long getCountOfAuthors();

}
