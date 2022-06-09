package com.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.main.model.Merchant;
import com.main.service.Merchantservice;

@RestController
@CrossOrigin(origins="*")
public class Merchantcontroller 
{
	@Autowired
	Merchantservice ms;
	
	@PostMapping("/merchant/save")
	public void addmerchant(@RequestBody Merchant merc)
	{
		ms.addmerchant(merc);
	}
	
	@PostMapping("/merchant/login")
	public boolean isvalidmerchant(@RequestParam String email, String pass)
	{
		return ms.isvalidmerchant(email, pass);
	}
	
	@GetMapping("/merchant/{email}")
	public Merchant getmerchantbyemail(@PathVariable("email") String email)
	{
		return ms.getmerchantbyemail(email);
	}
	
	@GetMapping("/merchant/{id}")
	public Merchant getmerchantbyid(@PathVariable("id") long id)
	{
		return ms.getmerchantbyid(id);
	}
	
	@GetMapping("/merchant/{id}/delete")
	public void deletemerchantbyid(@PathVariable("id") long id)
	{
		ms.deletemerchant(id);
	}
	
	@GetMapping("/merchant")
	public List<Merchant> getallmerchant()
	{
		return ms.getallmerchant();
	}
}
