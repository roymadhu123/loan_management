package com.wellsfargo.loan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wellsfargo.loan.model.EmpLoan;

public interface EmpLoanRepository extends JpaRepository<EmpLoan, Long> {
	
}

