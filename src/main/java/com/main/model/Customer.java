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
public class Customer 
{
	@Id
	@SequenceGenerator(name = "generator" , sequenceName = "seqcid" , allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "generator")
	private long cId;
	
	private String cemail;
	
	private String cpwd;
	
	private String cname;
	
	private int cage;
	
	private long cphno;
	
	@ManyToOne
	@JoinColumn(name = "addressId")
	private Address address;
	
	private LocalDateTime createddate;

	
	public long getcId() {
		return cId;
	}

	public void setcId(long cId) {
		this.cId = cId;
	}

	public String getCemail() {
		return cemail;
	}

	public void setCemail(String cemail) {
		this.cemail = cemail;
	}

	public String getCpwd() {
		return cpwd;
	}

	public void setCpwd(String cpwd) {
		this.cpwd = cpwd;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public int getCage() {
		return cage;
	}

	public void setCage(int cage) {
		this.cage = cage;
	}

	public long getCphno() {
		return cphno;
	}

	public void setCphno(long cphno) {
		this.cphno = cphno;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public LocalDateTime getDate() {
		return createddate;
	}

	public void setDate(LocalDateTime date) {
		this.createddate = date;
	}

	@Override
	public String toString() {
		return "Customer [cId=" + cId + ", cemail=" + cemail + ", cpwd=" + cpwd + ", cname=" + cname + ", cage=" + cage
				+ ", cphno=" + cphno + ", address=" + address + ", date=" + createddate + "]";
	}

	public Customer(long cId, String cemail, String cpwd, String cname, int cage, long cphno, Address address,
			LocalDateTime date) {
		super();
		this.cId = cId;
		this.cemail = cemail;
		this.cpwd = cpwd;
		this.cname = cname;
		this.cage = cage;
		this.cphno = cphno;
		this.address = address;
		this.createddate = date;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
}
