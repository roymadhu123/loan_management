package com.wellsfargo.loan.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Loan {

	@Id
	Long lid;
	
	String loanType;
	int duration;
	
	public Long getLid() {
		return lid;
	}
	public void setLid(Long lid) {
		this.lid = lid;
	}
	public String getLoanType() {
		return loanType;
	}
	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}

}
