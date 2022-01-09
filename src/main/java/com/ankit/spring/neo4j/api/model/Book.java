package com.ankit.spring.neo4j.api.model;

import org.neo4j.ogm.annotation.NodeEntity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NodeEntity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Book {
	
	private int id;
	private String name;
	private String author;
//setter and getter
	
}
