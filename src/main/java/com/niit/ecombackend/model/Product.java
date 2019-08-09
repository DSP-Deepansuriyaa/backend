package com.niit.ecombackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int pro_Id;
	@Column(nullable=false,unique=true)
	@NotEmpty(message="Product Name cannot be Blank")
	@Pattern(regexp="^[a-zA-Z]*$",message="Product name can only have Alphabet")
	String pro_Name;
	@Column(columnDefinition="text")
	String pro_Des;
	@ManyToOne
	Category pro_cat;
	@ManyToOne
	Seller pro_sel;
	@Column(nullable=false)
	@Range(min=5,max=25,message="Hurry up!! only 25 stocks are available")
	int stock;
	@Column(nullable=false)
	@Range(min=899,max=3500,message="Range above 899")
	Float pro_Price;
	
	public int getPro_Id() {
		return pro_Id;
	}

	public void setPro_Id(int pro_Id) {
		this.pro_Id = pro_Id;
	}

	public String getPro_Name() {
		return pro_Name;
	}

	public void setPro_Name(String pro_Name) {
		this.pro_Name = pro_Name;
	}

	public String getPro_Des() {
		return pro_Des;
	}

	public void setPro_Des(String pro_Des) {
		this.pro_Des = pro_Des;
	}

	public Category getPro_cat() {
		return pro_cat;
	}

	public void setPro_cat(Category pro_cat) {
		this.pro_cat = pro_cat;
	}

	public Seller getPro_sel() {
		return pro_sel;
	}

	public void setPro_sel(Seller pro_sel) {
		this.pro_sel = pro_sel;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public Float getPro_Price() {
		return pro_Price;
	}

	public void setPro_Price(Float pro_Price) {
		this.pro_Price = pro_Price;
	}

	
	
	

}
