package com.project.graph.graphdb.Service;

import com.project.graph.graphdb.Model.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookService {

    public Book saveBook(Book book);

    public List<Book> getBookByTitleContaining(String str);

    public Book getBookByTitle(String str);
    public List<Book> getAllBooks();

    public void deleteAllBooks();

    public void deleteBook(Long id);

    public Long getCountOfBooks();
}
