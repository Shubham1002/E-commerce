package com.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Address 
{
	@Id
	@SequenceGenerator(name="generator" ,sequenceName = "seqaddid" , allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "generator")
	private long addressId;
	
	private String  address1;
	private String address2;
	private String district;
	
	@ManyToOne
	@JoinColumn(name = "cityId")
	private City city;
	
	private String postalCode;
	

	public long getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", address1=" + address1 + ", address2=" + address2 + ", district="
				+ district + ", city=" + city + ", postalCode=" + postalCode + "]";
	}

	public Address(int addressId, String address1, String address2, String district, City city, String postalCode) {
		super();
		this.addressId = addressId;
		this.address1 = address1;
		this.address2 = address2;
		this.district = district;
		this.city = city;
		this.postalCode = postalCode;
	}
	
	
	
}
