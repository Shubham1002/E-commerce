package com.main.service;

import java.util.List;

import com.main.model.City;

public interface Cityservice 
{
	public void saveall(List<City> city);
	public void savcity(City city);
	public City getcity(long id);
	public List<City> getallcity();
	public void updateCity(City city);
	public List<City> findbystateid(String stateId);
	public List<City> searchbycityname(String cityname);
}
