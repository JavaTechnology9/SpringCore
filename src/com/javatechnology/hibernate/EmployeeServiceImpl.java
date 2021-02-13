package com.javatechnology.hibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

import com.javatechnology.jdbc.model.Employee;
@Service("employeeService")
@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.SERIALIZABLE,readOnly=true,timeout=1)
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDao employeeDao;
	
	private TransactionTemplate template;

	@Override
	public void saveEmployee(final Employee employee) {
		template.execute(new TransactionCallback<Employee>() {

			@Override
			public Employee doInTransaction(TransactionStatus status) {
				try {
					employeeDao.saveEmployee(employee);
				}catch(RuntimeException ex) {
					status.setRollbackOnly();
				}
				return null;
			}
		});
		

	}

}
