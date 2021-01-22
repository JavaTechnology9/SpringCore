package com.javatechnology.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javatechnology.jdbc.model.Person;
@Service("personService")
public class PersonServiceImpl implements PersonService{
	@Autowired
	private PersonDao dao;
	
	public void setPersonDao(PersonDao dao) {
		this.dao=dao;
	}

	@Override
	public String savePerson(Person person) {
		return dao.savePerson(person);
	}

	@Override
	public Person getPerson(Long id) {
		return dao.getPerson(id);
	}

	@Override
	public Person updatePerson(Person person) {
		return dao.updatePerson(person);
	}

	

}
