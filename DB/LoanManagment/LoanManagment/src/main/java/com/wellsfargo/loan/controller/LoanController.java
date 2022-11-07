package com.wellsfargo.loan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wellsfargo.loan.model.EmpLoan;
import com.wellsfargo.loan.model.Loan;
import com.wellsfargo.loan.service.EmpLoanService;
import com.wellsfargo.loan.service.LoanService;

@RestController // generate & manage REST API in json format
@RequestMapping(value="/api")
public class LoanController {

	@Autowired
	private LoanService lservice;
	
	@GetMapping("/Loan")
	public List<Loan> getAllCustomers(){
		
		return lservice.getAllLoan();
	}
	
}
