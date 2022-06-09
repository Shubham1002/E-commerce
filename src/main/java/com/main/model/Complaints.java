package com.main.model;

import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Complaints 
{
	@Id
	@SequenceGenerator(name="generator" ,sequenceName = "complaintid" , allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "generator")
	private long complaintId;
	
	private String emailId;
	private String probTopic;
	private String probDesc;
	private LocalDateTime probDate;
	
	
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getProbTopic() {
		return probTopic;
	}
	public void setProbTopic(String probTopic) {
		this.probTopic = probTopic;
	}
	public String getProbDesc() {
		return probDesc;
	}
	public void setProbDesc(String probDesc) {
		this.probDesc = probDesc;
	}
	public LocalDateTime getProbDate() {
		return probDate;
	}
	public void setProbDate(LocalDateTime probDate) {
		this.probDate = probDate;
	}
	@Override
	public String toString() {
		return "Complaints [emailId=" + emailId + ", probTopic=" + probTopic + ", probDesc=" + probDesc + ", probDate="
				+ probDate + "]";
	}
	public Complaints(String emailId, String probTopic, String probDesc, LocalDateTime probDate) {
		super();
		this.emailId = emailId;
		this.probTopic = probTopic;
		this.probDesc = probDesc;
		this.probDate = probDate;
	}
	public Complaints() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
