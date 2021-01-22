package com.javatechnology.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.javatechnology.Performer;
import com.javatechnology.jdbc.model.Person;

public class SpringJDBCMain {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("SpringConfig.xml");
		PersonService personService=(PersonService)context.getBean("personService");
		Person person=new Person();
		person.setId(26);
		person.setName("UPDATE2");
		//person.setAddress("SPRING_NAMED_ANNOTATIONS");
		personService.updatePerson(person);
		/*Person person = personService.getPerson((long) 25);
		System.out.println(person.getAddress());*/

	}

}
