package com.wellsfargo.loan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wellsfargo.loan.model.Employee;
import com.wellsfargo.loan.model.Purchase;
import com.wellsfargo.loan.service.EmployeeService;

@RestController 
@RequestMapping(value="/api")
public class EmployeeController {

	@Autowired
	private EmployeeService eservice;
	

	
	
	
	
}
