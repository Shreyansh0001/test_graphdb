package com.project.graph.graphdb.Service;

import com.project.graph.graphdb.Model.Book;
import com.project.graph.graphdb.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServiceImpl implements BookService{

    @Override
    public Book getBookByTitle(String str) {
        return bookRepository.findByTitle(str);
    }

    @Autowired
    BookRepository bookRepository;
    @Override
    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public List<Book> getBookByTitleContaining(String str) {
        return bookRepository.findByTitleContaining(str);
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.getAllBooks();
    }

    @Override
    public void deleteAllBooks() {
        bookRepository.deleteAll();
    }

    @Override
    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }

    @Override
    public Long getCountOfBooks() {
        return bookRepository.count();
    }
}
