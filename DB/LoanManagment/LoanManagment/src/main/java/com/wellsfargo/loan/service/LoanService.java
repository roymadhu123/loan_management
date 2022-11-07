package com.wellsfargo.loan.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wellsfargo.loan.model.Loan;
import com.wellsfargo.loan.repository.LoanRepository;

@Service
@Transactional
public class LoanService {

	@Autowired
	private LoanRepository lrepo;
	
	public List<Loan> getAllLoan()
	{
		return lrepo.findAll();
	}
}
