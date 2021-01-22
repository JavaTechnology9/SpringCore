package com.javatechnology.jdbc;

import com.javatechnology.jdbc.model.Person;

public interface PersonDao {
	public String savePerson(Person person);
	public Person getPerson(Long id);
	public Person updatePerson(Person person);

}
