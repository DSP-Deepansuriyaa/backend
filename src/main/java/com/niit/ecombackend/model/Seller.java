package com.niit.ecombackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Seller {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int sel_Id;
	@Column(nullable=false,unique=true)
	@NotEmpty(message="Seller Name cannot be Blank")
	@Pattern(regexp="^[a-zA-Z]*$",message="Seller name can only have Alphabet")
	String sel_Name;
	
	String sel_Location;

	public int getSel_Id() {
		return sel_Id;
	}

	public void setSel_Id(int sel_Id) {
		this.sel_Id = sel_Id;
	}

	public String getSel_Name() {
		return sel_Name;
	}

	public void setSel_Name(String sel_Name) {
		this.sel_Name = sel_Name;
	}

	public String getSel_Location() {
		return sel_Location;
	}

	public void setSel_Location(String sel_Location) {
		this.sel_Location = sel_Location;
	}

}
