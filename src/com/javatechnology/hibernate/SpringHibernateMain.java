package com.javatechnology.hibernate;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.javatechnology.jdbc.model.Employee;

public class SpringHibernateMain {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		AbstractApplicationContext context=new AnnotationConfigApplicationContext(SpringHibernateConfiguration.class);
		EmployeeService service=(EmployeeService)context.getBean("employeeService");
		Employee employee=new Employee();
		employee.setEmployeeName("Hibernate_Annotations");
		employee.setEmployeeAddress("Annotations_Example");
		service.saveEmployee(employee);

	}

}
