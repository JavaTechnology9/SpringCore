package com.javatechnology.hibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.javatechnology.jdbc.model.Employee;
@Repository("employeeDao")
public class EmployeeDaoImpl implements EmployeeDao {
	@Autowired
	private HibernateTemplate template;

	@Override
	public void saveEmployee(Employee employee) {
		template.saveOrUpdate(employee);

	}

}
