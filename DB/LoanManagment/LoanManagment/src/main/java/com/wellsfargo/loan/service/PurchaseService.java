package com.wellsfargo.loan.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.wellsfargo.loan.model.Purchase;
import com.wellsfargo.loan.repository.PurchaseRepository;

@Service
@Transactional
public class PurchaseService {

	@Autowired
	private PurchaseRepository prepo;
	
	public List<Purchase> getAllPurchase()
	{
		return prepo.findAll();
	}

}
