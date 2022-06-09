package com.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Country 
{
	@Id
	private String countryId;
	
	private String countryName;
	

	public String getCountryId() {
		return countryId;
	}

	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	@Override
	public String toString() {
		return "Country [countryId=" + countryId + ", countryName=" + countryName + "]";
	}

	public Country(String countryId, String countryName) {
		super();
		this.countryId = countryId;
		this.countryName = countryName;
	}

	public Country() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
