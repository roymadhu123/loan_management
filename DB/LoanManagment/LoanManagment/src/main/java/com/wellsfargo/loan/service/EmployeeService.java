package com.wellsfargo.loan.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wellsfargo.loan.model.Employee;
import com.wellsfargo.loan.repository.EmployeeRepository;

/* Interacts with repository*/

@Service
@Transactional
public class EmployeeService {

	@Autowired
	private EmployeeRepository erepo;
	
	public List<Employee> getAllCustomers()
	{
		return erepo.findAll();
	}
	
}
