package com.wellsfargo.loan.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EmpLoan {

	@Id
	Long eid;
	
	@Id
	Long lid;
	
	String descripton;
	String category;
	int value;
	String item_make;
	
	
	public Long getEid() {
		return eid;
	}
	public void setEid(Long eid) {
		this.eid = eid;
	}
	public Long getLid() {
		return lid;
	}
	public void setLid(Long lid) {
		this.lid = lid;
	}
	public String getDescripton() {
		return descripton;
	}
	public void setDescripton(String descripton) {
		this.descripton = descripton;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getItemMake() {
		return item_make;
	}
	public void setItemMake(String item_make) {
		this.item_make = item_make;
	}
	
}
