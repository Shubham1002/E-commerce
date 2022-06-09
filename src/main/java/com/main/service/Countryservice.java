package com.main.service;

import java.util.List;

import com.main.model.Country;

public interface Countryservice 
{
	public void saveall(List<Country> country);
	public void savecountry(Country country);
	public Country getcountry(String id);
	public List<Country> getallcountry();
	public void update(Country country);
}
