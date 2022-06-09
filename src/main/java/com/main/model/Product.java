package com.main.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import org.springframework.lang.NonNull;

@Entity
public class Product 
{
	@Id
	@SequenceGenerator(name="generator" ,sequenceName = "seqprodid" , allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "generator")
	private long prodId;
	
	@ManyToOne
	@JoinColumn(name = "subcatId")
	private SubCategories scat;
	
	@ManyToOne
	@JoinColumn(name = "MId")
	private Merchant merchant;
	
	@NonNull
	private String prodName;

	private String prodDesc;
	
	@OneToMany
	@JoinColumn(name = "proddescId")
	private List<Productdesc> proddesc;

	
	public long getProdId() {
		return prodId;
	}

	public void setProdId(long prodId) {
		this.prodId = prodId;
	}

	public SubCategories getScat() {
		return scat;
	}

	public void setScat(SubCategories scat) {
		this.scat = scat;
	}

	public Merchant getMerchant() {
		return merchant;
	}

	public void setMerchant(Merchant merchant) {
		this.merchant = merchant;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public String getProdDesc() {
		return prodDesc;
	}

	public void setProdDesc(String prodDesc) {
		this.prodDesc = prodDesc;
	}

	public List<Productdesc> getProddesc() {
		return proddesc;
	}

	public void setProddesc(List<Productdesc> proddesc) {
		this.proddesc = proddesc;
	}

	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", scat=" + scat + ", merchant=" + merchant + ", prodName=" + prodName
				+ ", prodDesc=" + prodDesc + ", proddesc=" + proddesc + "]";
	}

	public Product(long prodId, SubCategories scat, Merchant merchant, String prodName, String prodDesc,
			List<Productdesc> proddesc2) {
		super();
		this.prodId = prodId;
		this.scat = scat;
		this.merchant = merchant;
		this.prodName = prodName;
		this.prodDesc = prodDesc;
		proddesc = proddesc2;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
}
