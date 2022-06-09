package com.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import org.springframework.lang.NonNull;

@Entity
public class SubCategories 
{
	@Id
	@SequenceGenerator(name="generator" ,sequenceName = "seqsubcatid" , allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "generator")
	private long subcatId;
	
	@ManyToOne
	@JoinColumn(name = "catId")
	private Category cat;
	
	@NonNull
	private String subcatName;

	private String subcatDesc;
	
	private String subcatImg;
	

	public long getSubcatId() {
		return subcatId;
	}

	public void setSubcatId(long subcatId) {
		this.subcatId = subcatId;
	}

	public Category getCat() {
		return cat;
	}

	public void setCat(Category cat) {
		this.cat = cat;
	}

	public String getSubcatName() {
		return subcatName;
	}

	public void setSubcatName(String subcatName) {
		this.subcatName = subcatName;
	}

	public String getSubcatDesc() {
		return subcatDesc;
	}

	public void setSubcatDesc(String subcatDesc) {
		this.subcatDesc = subcatDesc;
	}

	public String getSubcatImg() {
		return subcatImg;
	}

	public void setSubcatImg(String subcatImg) {
		this.subcatImg = subcatImg;
	}

	@Override
	public String toString() {
		return "SubCategories [subcatId=" + subcatId + ", cat=" + cat + ", subcatName=" + subcatName + ", subcatDesc="
				+ subcatDesc + ", subcatImg=" + subcatImg + "]";
	}

	public SubCategories(long subcatId, Category cat, String subcatName, String subcatDesc, String subcatImg) {
		super();
		this.subcatId = subcatId;
		this.cat = cat;
		this.subcatName = subcatName;
		this.subcatDesc = subcatDesc;
		this.subcatImg = subcatImg;
	}

	public SubCategories() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
