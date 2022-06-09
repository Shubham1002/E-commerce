package com.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class City 
{
	@Id
	@SequenceGenerator(name="generator" ,sequenceName = "seqcityid" , allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "generator")
	private long cityId;
	
	private String cityName;
	
	@ManyToOne
	@JoinColumn(name = "stateId")
	private State state;

	
	public long getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "City [cityId=" + cityId + ", cityName=" + cityName + ", state=" + state + "]";
	}

	public City(int cityId, String cityName, State state) {
		super();
		this.cityId = cityId;
		this.cityName = cityName;
		this.state = state;
	}

	public City() {
		super();
		// TODO Auto-generated constructor stub
	}
}
