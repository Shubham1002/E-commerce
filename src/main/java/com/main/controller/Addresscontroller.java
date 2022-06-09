package com.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.main.model.Address;
import com.main.service.Addressservice;

@RestController
@CrossOrigin(origins = "*")
public class Addresscontroller 
{
	@Autowired
	Addressservice as;
	
	@PostMapping("/address/save")
	public Address saveadd(@RequestBody Address add)
	{
		return as.addsave(add);
	}
	
	@GetMapping("/address/{id}")
	public Address getadd(@PathVariable("id")long id)
	{
		return as.getadd(id);
	}
	
	@GetMapping("/address/{id}/delete")
	public void deleteadd(@PathVariable("id")long id)
	{
		as.deleteadd(id);
	}
}
