package com.project.graph.graphdb.Model;

import lombok.Data;
import org.neo4j.ogm.annotation.NodeEntity;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.List;

@Data
@NodeEntity
public class Author {

    @Id
    @GeneratedValue
    private Long id;
    private String name;

    @Relationship(type = "AUTHORED", direction = Relationship.Direction.INCOMING)
    private List books;

}
