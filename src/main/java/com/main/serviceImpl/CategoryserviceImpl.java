package com.main.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.model.Category;
import com.main.repo.Categoryrepo;
import com.main.service.Categoryservice;

@Service
public class CategoryserviceImpl implements Categoryservice
{
	@Autowired
	Categoryrepo cr;

	@Override
	public List<Category> getallcategory() {
		// TODO Auto-generated method stub
		List<Category> lst=cr.findAll();
		return lst;
	}

	@Override
	public Category getcategorybyid(long id) {
		// TODO Auto-generated method stub
		return cr.findById(id).get();
	}

	@Override
	public void deletebyid(long id) {
		// TODO Auto-generated method stub
		cr.deleteById(id);
	}

	@Override
	public Category insertcategory(Category category) {
		// TODO Auto-generated method stub
		return cr.save(category);
	}

	@Override
	public Category updatecategory(Category category) {
		// TODO Auto-generated method stub
		return cr.saveAndFlush(category);
	}
	
	
}
