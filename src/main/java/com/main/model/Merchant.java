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
public class Merchant 
{
	@Id
	@SequenceGenerator(name = "generator" , sequenceName = "seqmid" , allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "generator")
	private long MId;
	
	private String memail;
	
	private String mpwd;
	
	private String mname;
	
	private int mage;
	
	private long mphno;
	
	@ManyToOne
	@JoinColumn(name = "addressId")
	private Address address;
	
	private String mfirmname;
	
	private String mgstno;
	
	private LocalDateTime createddate;

	
	public long getMId() {
		return MId;
	}

	public void setMId(long mId) {
		MId = mId;
	}

	public String getMemail() {
		return memail;
	}

	public void setMemail(String memail) {
		this.memail = memail;
	}

	public String getNpwd() {
		return mpwd;
	}

	public void setNpwd(String npwd) {
		this.mpwd = npwd;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public int getMage() {
		return mage;
	}

	public void setMage(int mage) {
		this.mage = mage;
	}

	public long getMphno() {
		return mphno;
	}

	public void setMphno(long mphno) {
		this.mphno = mphno;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getMfirmname() {
		return mfirmname;
	}

	public void setMfirmname(String mfirmname) {
		this.mfirmname = mfirmname;
	}

	public String getMgstno() {
		return mgstno;
	}

	public void setMgstno(String mgstno) {
		this.mgstno = mgstno;
	}

	public LocalDateTime getDate() {
		return createddate;
	}

	public void setDate(LocalDateTime date) {
		this.createddate = date;
	}

	public Merchant(long mId, String memail, String mpwd, String mname, int mage, long mphno, Address address,
			String mfirmname, String mgstno, LocalDateTime date) {
		super();
		MId = mId;
		this.memail = memail;
		this.mpwd = mpwd;
		this.mname = mname;
		this.mage = mage;
		this.mphno = mphno;
		this.address = address;
		this.mfirmname = mfirmname;
		this.mgstno = mgstno;
		this.createddate = date;
	}

	@Override
	public String toString() {
		return "Merchant [MId=" + MId + ", memail=" + memail + ", mpwd=" + mpwd + ", mname=" + mname + ", mage=" + mage
				+ ", mphno=" + mphno + ", address=" + address + ", mfirmname=" + mfirmname + ", mgstno=" + mgstno
				+ ", date=" + createddate + "]";
	}

	public Merchant() {
		super();
		// TODO Auto-generated constructor stub
	}
}
