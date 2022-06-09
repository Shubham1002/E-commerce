package com.main.model;

import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Productdesc 
{
	@Id
	@SequenceGenerator(name="generator" ,sequenceName = "seqproddescid" , allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "generator")
	private long proddescId;
	
	@ManyToOne
	@JoinColumn(name = "prodId")
	private Product prod;
	
	private String prodSize;
	
	private int prodPrice;
	
	private int prodQty;
	
	private String img;
	
	private LocalDateTime prodCreateddate;
	

	public long getProddescId() {
		return proddescId;
	}

	public void setProddescId(long proddescId) {
		this.proddescId = proddescId;
	}

	public Product getProd() {
		return prod;
	}

	public void setProd(Product prod) {
		this.prod = prod;
	}

	public String getProdSize() {
		return prodSize;
	}

	public void setProdSize(String prodSize) {
		this.prodSize = prodSize;
	}

	public int getProdPrice() {
		return prodPrice;
	}

	public void setProdPrice(int prodPrice) {
		this.prodPrice = prodPrice;
	}

	public int getProdQty() {
		return prodQty;
	}

	public void setProdQty(int prodQty) {
		this.prodQty = prodQty;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public LocalDateTime getProdCreateddate() {
		return prodCreateddate;
	}

	public void setProdCreateddate(LocalDateTime prodCreateddate) {
		this.prodCreateddate = prodCreateddate;
	}

	@Override
	public String toString() {
		return "Productdesc [proddescId=" + proddescId + ", prod=" + prod + ", prodSize=" + prodSize + ", prodPrice="
				+ prodPrice + ", prodQty=" + prodQty + ", img=" + img + ", prodCreateddate=" + prodCreateddate + "]";
	}

	public Productdesc(long proddescId, Product prod, String prodSize, int prodPrice, int prodQty, String img,
			LocalDateTime prodCreateddate) {
		super();
		this.proddescId = proddescId;
		this.prod = prod;
		this.prodSize = prodSize;
		this.prodPrice = prodPrice;
		this.prodQty = prodQty;
		this.img = img;
		this.prodCreateddate = prodCreateddate;
	}

	public Productdesc() {
		super();
		// TODO Auto-generated constructor stub
	}
}
