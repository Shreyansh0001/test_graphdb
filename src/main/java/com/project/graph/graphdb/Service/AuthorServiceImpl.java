package com.project.graph.graphdb.Service;

import com.project.graph.graphdb.Model.Author;
import com.project.graph.graphdb.Repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorServiceImpl implements AuthorService{

    @Autowired
    AuthorRepository authorRepository;
    @Override
    public List getAll() {
        return authorRepository.getAllAuthors();
    }

    @Override
    public Author saveAuthor(Author author) {
        return authorRepository.save(author);
    }

    @Override
    public Optional<Author> getAuthorById(Long id) {
        return authorRepository.findById(id);
    }

    @Override
    public void deleteAuthor(Long id) {
        authorRepository.deleteById(id);
    }

    @Override
    public Long getCountOfAuthors() {
        return authorRepository.count();
    }

    @Override
    public void deleteAllAuthors() {
        authorRepository.deleteAll();
    }
}
