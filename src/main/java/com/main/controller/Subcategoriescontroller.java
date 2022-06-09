package com.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.main.model.SubCategories;
import com.main.service.Subcategoriesservice;

@RestController
@CrossOrigin(origins = "*")
public class Subcategoriescontroller 
{
	@Autowired
	Subcategoriesservice scs;
	
	@GetMapping("/subcat")
	public List<SubCategories> GetAllsubcat()
	{
		return scs.findallsubcat();
		
	}
	
	@GetMapping("/subcat/{subcatId}")
	public SubCategories GetsubCatbyId(@PathVariable("subcatId") long subcatId)
	{
		return scs.findsubcat(subcatId);
		
	}
	
	@PostMapping("/subcat/save")
	public void Addsubcat(@RequestBody SubCategories c1)
	{
		 scs.insertsubcat(c1);
	}
	
	@PostMapping("/subcat/update")
	public void updateCat(@RequestBody SubCategories c1)
	{
		scs.updatesubcat(c1);
	}
	
	@GetMapping("/subcat/{subcatId}/delete")
	public void DeleteCatbyId(@PathVariable("subcatId") long subcatId)
	{
		scs.deletesubcat(subcatId);
	}
}
