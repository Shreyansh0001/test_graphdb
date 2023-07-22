package com.project.graph.graphdb.Repository;

import java.util.List;
import com.project.graph.graphdb.Model.Book;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends Neo4jRepository<Book, Long> {

    Book findByTitle(String title);
    Book findByLanguage(String language);

    @Query("MATCH (b:Book) Return b")
    List<Book> getAllBooks();

    @Query("MATCH (b:Book) WHERE b.title =~ ('(?i).*'+$str+'.*') RETURN b")
    List<Book> findByTitleContaining(String str);
}
