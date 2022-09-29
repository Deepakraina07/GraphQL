package com.samco.model;

import java.util.Arrays;
import java.util.List;

public class Author {

	private String id;
	private String firstName;
	private String lastName;
	
	public Author(String id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	private static List<Author> authors = Arrays.asList(
			new Author("author-1","Mani","Ratnam"),
			new Author("author-2","Selva","Raghavan"),
			new Author("author-3","Vetri","Maran")
			);

	public static Author getById(String id) {
		return authors.stream().filter(author -> author.getId().equals(id)).findFirst().orElse(null);
	}
	
	public String getId() {
		return id;
	}	
}
