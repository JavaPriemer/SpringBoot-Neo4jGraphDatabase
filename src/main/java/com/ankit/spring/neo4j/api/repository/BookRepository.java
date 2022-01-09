package com.ankit.spring.neo4j.api.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import com.ankit.spring.neo4j.api.model.Book;

public interface BookRepository extends Neo4jRepository<Book,Integer> {

	Book findBookByName(String name);

	void deleteById(int id);


}
