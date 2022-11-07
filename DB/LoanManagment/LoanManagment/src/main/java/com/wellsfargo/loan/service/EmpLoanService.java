package com.wellsfargo.loan.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wellsfargo.loan.model.EmpLoan;
import com.wellsfargo.loan.repository.EmpLoanRepository;

@Service
@Transactional
public class EmpLoanService {

	@Autowired
	private EmpLoanRepository elrepo;
	
	public EmpLoan registerCustomer(EmpLoan emp) {
		return elrepo.save(emp); // invoke jpa repository save() method
	}
	
	public List<EmpLoan> getAllEmpLoan()
	{
		return elrepo.findAll();
	}
}
