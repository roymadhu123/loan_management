package com.wellsfargo.loan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wellsfargo.loan.model.Loan;

public interface LoanRepository extends JpaRepository<Loan, Long> {
	
}

