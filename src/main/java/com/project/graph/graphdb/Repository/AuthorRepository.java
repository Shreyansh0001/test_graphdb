package com.project.graph.graphdb.Repository;

import com.project.graph.graphdb.Model.Author;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuthorRepository extends Neo4jRepository<Author, Long> {

    @Query("MATCH (au:Author)<-[a:AUTHORED]-(b:Book) RETURN au,a,b")
    List<Author> getAllAuthors();
}
