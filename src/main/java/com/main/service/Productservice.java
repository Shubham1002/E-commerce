package com.main.service;

import java.util.List;

import com.main.model.Product;

public interface Productservice 
{
	public List<Product> findallprod();
	public Product findprodbyId(long id);
	public Product addprod(Product prod);
	public void deleteprodbyId(long id);
	public Product updateprod(Product prod);
	public List<Product> searchbyprod(String name);
	public List<Product> searchbysubcat(String name);
	public List<Product> searchbycat(String name);
}
