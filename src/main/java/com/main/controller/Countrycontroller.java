package com.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.main.model.Country;
import com.main.service.Countryservice;

@RestController
@CrossOrigin(origins = "*")
public class Countrycontroller 
{
	@Autowired
	Countryservice cs;
	
	@PostMapping("/country/saveall")
	public void saveall(@RequestBody List<Country> country)
	{
		cs.saveall(country);
	}
	
	@PostMapping("/country/save")
	public void savecountry(@RequestBody Country country)
	{
		cs.savecountry(country);
	}
	
	@GetMapping("/country")
	public List<Country> findallcountry()
	{
		return cs.getallcountry();
	}
	
	@GetMapping("/country/{id}")
	public Country findbyid(@PathVariable("id") String id)
	{
		return cs.getcountry(id);
	}
	
	@PostMapping("/country/update")
	public void countryupdate(@RequestBody Country country)
	{
		cs.update(country);
	}
}
