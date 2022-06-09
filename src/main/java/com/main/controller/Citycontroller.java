package com.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.main.model.City;
import com.main.service.Cityservice;

@RestController
@CrossOrigin(origins = "*")
public class Citycontroller 
{
	@Autowired
	Cityservice cs;
	
	@PostMapping("/city/saveall")
	public void saveallcity(@RequestBody List<City> city)
	{
		cs.saveall(city);
	}
	
	@PostMapping("/city/save")
	public void savecity(@RequestBody City city)
	{
		cs.savcity(city);
	}
	
	@GetMapping("/city")
	public List<City> getallcity()
	{
		return cs.getallcity();
	}
	
	@GetMapping("/city/{id}")
	public City getcity(@PathVariable("id") Long id)
	{
		return cs.getcity(id);
	}
	
	@GetMapping("/city/search/{name}")
	public List<City> searchbycityname(@PathVariable("name") String name)
	{
		return cs.searchbycityname(name);
	}
	
	@GetMapping("/state/{id}/city")
	public List<City> findbystateId(@PathVariable("id") String id)
	{
		return cs.findbystateid(id);
	}
	
	@PostMapping("/city/update")
	public void updatecity(@RequestBody City city)
	{
		cs.updateCity(city);
	}
}
