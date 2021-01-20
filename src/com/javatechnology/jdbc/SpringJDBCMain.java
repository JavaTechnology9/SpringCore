package com.javatechnology.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.javatechnology.Performer;
import com.javatechnology.jdbc.model.Person;

public class SpringJDBCMain {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("SpringConfig.xml");
		PersonService personService=(PersonService)context.getBean("personService");
		/*Person person=new Person();
		person.setId(18);
		person.setName("SPRINGNAMEDpARAMETER");
		person.setAddress("SPRING_NAMEDPARAMETER_ADDRESS");
		personService.savePerson(person);*/
		Person person = personService.getPerson((long) 18);
		System.out.println(person.getAddress());

	}

}
