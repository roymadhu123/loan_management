package com.wellsfargo.loan.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wellsfargo.loan.model.EmpLoan;
import com.wellsfargo.loan.repository.EmpLoanRepository;
import com.wellsfargo.loan.service.EmpLoanService;

@RestController // generate & manage REST API in json format
@RequestMapping(value="/api")
public class EmpLoanController {

	@Autowired
	private EmpLoanService elservice;
	
	@PostMapping("/emploan")
	public EmpLoan registerEmp(@Validated @RequestBody EmpLoan el) {
		
		EmpLoan e1=new EmpLoan();
		// invoke service method
		
		e1.setEid(el.getEid());
		e1.setCategory(el.getCategory());
		e1.setDescripton(el.getDescripton());
		e1.setItemMake(el.getItemMake());
		e1.setValue(el.getValue());
		
		 return e1;
	}
	

	@GetMapping("/empLoan")
	public List<EmpLoan> getAllCustomers(){
		
		return elservice.getAllEmpLoan();
	}
	
	
}
