package com.wellsfargo.loan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wellsfargo.loan.model.Purchase;

public interface PurchaseRepository extends JpaRepository<Purchase, Long> {
	
}
