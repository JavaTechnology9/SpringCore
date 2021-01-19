package com.javatechnology.jdbc;

import com.javatechnology.jdbc.model.Person;

public class PersonServiceImpl implements PersonService{
	private PersonDao dao;
	
	public void setPersonDao(PersonDao dao) {
		this.dao=dao;
	}

	@Override
	public String savePerson(Person person) {
		return dao.savePerson(person);
	}

	

}
