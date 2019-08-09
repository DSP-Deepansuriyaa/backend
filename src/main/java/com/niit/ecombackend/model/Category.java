package com.niit.ecombackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Category {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int cat_Id;
	@Column(nullable=false,unique=true)
	@NotEmpty(message="Category Name cannot be Blank")
	@Pattern(regexp="^[a-zA-Z]*$",message="Category name can only have Alphabet")
	String cat_Name;
	@Column(columnDefinition="Text")
	String cat_Des;

	public int getCat_Id() {
		return cat_Id;
	}

	public void setCat_Id(int cat_Id) {
		this.cat_Id = cat_Id;
	}

	public String getCat_Name() {
		return cat_Name;
	}

	public void setCat_Name(String cat_Name) {
		this.cat_Name = cat_Name;
	}

	public String getCat_Des() {
		return cat_Des;
	}

	public void setCat_Des(String cat_Des) {
		this.cat_Des = cat_Des;
	}

}
