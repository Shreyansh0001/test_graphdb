package com.project.graph.graphdb.Model;

import lombok.Data;
import org.neo4j.ogm.annotation.NodeEntity;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Data
@NodeEntity
public class Book {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String language;
}
