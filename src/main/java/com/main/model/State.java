package com.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class State 
{
	@Id
	private String stateId;
	
	private String stateName;
	
	@ManyToOne
	@JoinColumn(name = "countryId")
	private Country country;

	
	public String getStateId() {
		return stateId;
	}

	public void setStateId(String stateId) {
		this.stateId = stateId;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "State [stateId=" + stateId + ", stateName=" + stateName + ", country=" + country + "]";
	}

	public State(String stateId, String stateName, Country country) {
		super();
		this.stateId = stateId;
		this.stateName = stateName;
		this.country = country;
	}

	public State() {
		super();
		// TODO Auto-generated constructor stub
	}
}
