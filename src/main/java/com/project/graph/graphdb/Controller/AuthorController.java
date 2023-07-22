package com.project.graph.graphdb.Controller;

import com.project.graph.graphdb.Model.Author;
import com.project.graph.graphdb.Service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.NoSuchElementException;
import java.util.Optional;

@RestController
@RequestMapping("/api/authors")
public class AuthorController {
    @Autowired
    AuthorService authorService;

    @PostMapping("/add")
    public Author addAuthor(@RequestBody Author author) {
        return authorService.saveAuthor(author);
    }

    @GetMapping("/{id}")
    public Object getAuthorById(@PathVariable String id) {
        Optional authorOpt = authorService.getAuthorById(Long.parseLong(id));
        if (authorOpt.isPresent()) {
            return authorOpt.get();
        }
        throw new NoSuchElementException("No author found with the given id");
    }

    @GetMapping
    public Collection getAllAuthors() {
        return authorService.getAll();
    }

    @GetMapping("/count")
    public Long getCountOfAuthors(){
        return authorService.getCountOfAuthors();
    }
    @DeleteMapping("/{id}")
    public String deleteAuthorById(@PathVariable String id)
    {
        authorService.deleteAuthor(Long.parseLong(id));
        return "Author deleted Successfully";
    }

    @DeleteMapping
    public String deleteAllAuthors(){
        authorService.deleteAllAuthors();
        return "All Authors have been deleted successfully";
    }


}
