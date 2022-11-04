package com.wellsfargo.loan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wellsfargo.loan.model.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	
}



