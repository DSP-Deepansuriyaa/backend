package com.niit.ecombackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
	int cust_Id;
	@Column(nullable=false)
	String cust_Name;
	@Column(nullable=false,unique=true)
	String cust_Email;
	@Column(nullable=false,unique=true,length=10)
	String cust_Phno;

	public int getCust_Id() {
		return cust_Id;
	}

	public void setCust_Id(int cust_Id) {
		this.cust_Id = cust_Id;
	}

	public String getCust_Name() {
		return cust_Name;
	}

	public void setCust_Name(String cust_Name) {
		this.cust_Name = cust_Name;
	}

	public String getCust_Email() {
		return cust_Email;
	}

	public void setCust_Email(String cust_Email) {
		this.cust_Email = cust_Email;
	}

	public String getCust_Phno() {
		return cust_Phno;
	}

	public void setCust_Phno(String cust_Phno) {
		this.cust_Phno = cust_Phno;
	}
	
	
}
