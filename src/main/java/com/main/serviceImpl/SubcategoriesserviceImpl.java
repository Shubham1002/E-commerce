package com.main.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.model.SubCategories;
import com.main.repo.Subcategoriesrepo;
import com.main.service.Subcategoriesservice;

@Service
public class SubcategoriesserviceImpl implements Subcategoriesservice
{
	@Autowired
	Subcategoriesrepo scr;

	@Override
	public void insertsubcat(SubCategories subcat) {
		// TODO Auto-generated method stub
		scr.save(subcat);
	}

	@Override
	public void deletesubcat(Long subcatid) {
		// TODO Auto-generated method stub
		scr.deleteById(subcatid);
	}

	@Override
	public List<SubCategories> findallsubcat() {
		// TODO Auto-generated method stub
		return scr.findAll();
	}

	@Override
	public SubCategories findsubcat(Long subcatid) {
		// TODO Auto-generated method stub
		return scr.findById(subcatid).get();
	}

	@Override
	public void updatesubcat(SubCategories subcat) {
		// TODO Auto-generated method stub
		scr.saveAndFlush(subcat);
	}
}
