package com.main.service;

import java.util.List;

import com.main.model.Category;

public interface Categoryservice 
{
	public List<Category> getallcategory();
	public Category getcategorybyid(long id);
	public void deletebyid(long id);
	public Category insertcategory(Category category);
	public Category updatecategory(Category category);
}
