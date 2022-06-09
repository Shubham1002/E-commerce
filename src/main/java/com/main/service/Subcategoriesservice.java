package com.main.service;

import java.util.List;

import com.main.model.SubCategories;

public interface Subcategoriesservice 
{
	public void insertsubcat(SubCategories subcat);
	public void deletesubcat(Long subcatid);
	public List<SubCategories> findallsubcat();
	public SubCategories findsubcat(Long subcatid);
	public void updatesubcat(SubCategories subcat);
}
