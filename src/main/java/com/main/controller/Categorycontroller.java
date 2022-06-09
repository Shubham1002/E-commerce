package com.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.main.model.Category;
import com.main.service.Categoryservice;

@RestController
@CrossOrigin(origins = "*")
public class Categorycontroller 
{
	@Autowired
	Categoryservice cs;
	
	@GetMapping("/Category")
	public List<Category> GetAllCategory()
	{
		return cs.getallcategory();
		
	}
	
	@GetMapping("/Categories/{catId}")
	public Category GetCatbyId(@PathVariable("catId") Long catId)
	{
		return cs.getcategorybyid(catId);
		
	}
	
	@PostMapping("/Category/save")
	public Category AddCat(@RequestBody Category c1)
	{
		return cs.insertcategory(c1);
	}
	
	@PostMapping("/Category/update")
	public Category updateCat(@RequestBody Category c1)
	{
		return cs.updatecategory(c1);
	}
	
	@GetMapping("/Category/{catId}/delete")
	public String DeleteCatbyId(@PathVariable("catId") Long catId)
	{
		Category c1=cs.getcategorybyid(catId);
		if(c1 == null)
		{
			return "not found";
		}
		else
		{
			cs.deletebyid(catId);
			return "successfully deleted";
		}
	}
}
