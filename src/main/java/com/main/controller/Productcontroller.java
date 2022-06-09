package com.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.main.model.Product;
import com.main.service.Productservice;

@RestController
@CrossOrigin(origins = "*")
public class Productcontroller 
{
	@Autowired
	Productservice ps;
	
	@GetMapping("/product")
	public List<Product> GetAllproduct()
	{
		return ps.findallprod();
		
	}
	
	@GetMapping("/product/{prodId}")
	public Product GetprodbyId(@PathVariable("prodId") Long prodId)
	{
		return ps.findprodbyId(prodId);
		
	}
	
	@PostMapping("/product/save")
	public Product Addproduct(@RequestBody Product prod)
	{
		return ps.addprod(prod);
	}
	
	@PostMapping("/product/update")
	public Product updateproduct(@RequestBody Product prod)
	{
		return ps.updateprod(prod);
	}
	
	@GetMapping("/product/{prodId}/delete")
	public String DeleteprodbyId(@PathVariable("prodId") Long prodId)
	{
		Product prod=ps.findprodbyId(prodId);
		if(prod == null)
		{
			return "not found";
		}
		else
		{
			ps.deleteprodbyId(prodId);
			return "successfully deleted";
		}
	}
	
	@GetMapping("/product/search/{name}")
	public List<Product> productsearchbar(@PathVariable("name") String name)
	{
		List<Product> prod=ps.searchbycat(name);
		if(prod == null)
		{
			List<Product> prod1=ps.searchbysubcat(name);
			if(prod1 == null)
			{
				return ps.searchbyprod(name);
			}
			else
			{
				return prod1;
			}
		}
		else
		{
			return prod;
		}
	}
}
