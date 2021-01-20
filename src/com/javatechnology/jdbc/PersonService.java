package com.javatechnology.jdbc;

import com.javatechnology.jdbc.model.Person;

public interface PersonService {
	public String savePerson(Person person);
	public Person getPerson(Long id);

}
