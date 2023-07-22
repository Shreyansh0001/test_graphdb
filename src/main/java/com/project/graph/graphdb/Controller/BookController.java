package com.project.graph.graphdb.Controller;

import com.project.graph.graphdb.Model.Book;
import com.project.graph.graphdb.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {

    @Autowired
    BookService bookService;

    @PostMapping("/add")
    public Book addBook(@RequestBody Book book) {
        return bookService.saveBook(book);
    }

    @GetMapping("/{title}")
    public Book getBookByTitle(@PathVariable String title){
        return bookService.getBookByTitle(title);
    }

    @GetMapping("/title/{str}")
    public List getBookByTitleContaining(@PathVariable String str){
        return bookService.getBookByTitleContaining(str);
    }

    @GetMapping
    public Collection getAllBooks(){
        return bookService.getAllBooks();
    }

    @GetMapping("/count")
    public Long getCountOfBooks(){
        return bookService.getCountOfBooks();
    }

    @DeleteMapping("/{id}")
    public String deleteBookById(@PathVariable String id){
        bookService.deleteBook(Long.parseLong(id));
        return "Book successfully deleted";
    }

    @DeleteMapping
    public String deleteAllBooks(){
        bookService.deleteAllBooks();
        return "All Books have been deleted";
    }


}
