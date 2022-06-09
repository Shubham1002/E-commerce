package com.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import org.springframework.lang.NonNull;

@Entity
public class Category 
{
	@Id
	@SequenceGenerator(name="generator" ,sequenceName = "seqcatid" , allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "generator")
	private long catId;
	
	@NonNull
	private String catName;
	
	private String catImg;

	public long getCatId() {
		return catId;
	}

	public void setCatId(long catId) {
		this.catId = catId;
	}

	public String getCatName() {
		return catName;
	}

	public void setCatName(String catName) {
		this.catName = catName;
	}

	public String getCatImg() {
		return catImg;
	}

	public void setCatImg(String catImg) {
		this.catImg = catImg;
	}

	@Override
	public String toString() {
		return "Category [catId=" + catId + ", catName=" + catName + ", catImg=" + catImg + "]";
	}

	public Category(long catId, String catName, String catImg) {
		super();
		this.catId = catId;
		this.catName = catName;
		this.catImg = catImg;
	}

	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
}
