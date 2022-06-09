package com.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Prodratings 
{
	@Id
	@SequenceGenerator(name="generator" ,sequenceName = "prodratid" , allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "generator")
	private long prodratId;
	
	@OneToOne
	@JoinColumn(name = "cId")
	private Customer cust;
	
	@OneToOne
	@JoinColumn(name = "prodId")
	private Product prod;
	
	private String prodReview;
	private int prodRatings;
	
	
	public Customer getCust() {
		return cust;
	}
	public void setCust(Customer cust) {
		this.cust = cust;
	}
	public Product getProd() {
		return prod;
	}
	public void setProd(Product prod) {
		this.prod = prod;
	}
	public String getProdReview() {
		return prodReview;
	}
	public void setProdReview(String prodReview) {
		this.prodReview = prodReview;
	}
	public int getProdRatings() {
		return prodRatings;
	}
	public void setProdRatings(int prodRatings) {
		this.prodRatings = prodRatings;
	}
	@Override
	public String toString() {
		return "Prodratings [cust=" + cust + ", prod=" + prod + ", prodReview=" + prodReview + ", prodRatings="
				+ prodRatings + "]";
	}
	public Prodratings(Customer cust, Product prod, String prodReview, int prodRatings) {
		super();
		this.cust = cust;
		this.prod = prod;
		this.prodReview = prodReview;
		this.prodRatings = prodRatings;
	}
	public Prodratings() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
