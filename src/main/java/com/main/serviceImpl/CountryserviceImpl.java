package com.main.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.model.Country;
import com.main.repo.Countryrepo;
import com.main.service.Countryservice;

@Service
public class CountryserviceImpl implements Countryservice
{
	@Autowired
	Countryrepo cr;

	@Override
	public void saveall(List<Country> country) {
		// TODO Auto-generated method stub
		cr.saveAll(country);
	}

	@Override
	public void savecountry(Country country) {
		// TODO Auto-generated method stub
		cr.save(country);
	}

	@Override
	public Country getcountry(String id) {
		// TODO Auto-generated method stub
		return cr.findById(id).get();
	}

	@Override
	public List<Country> getallcountry() {
		// TODO Auto-generated method stub
		List<Country> lst=cr.findAll();
		return lst;
	}

	@Override
	public void update(Country country) {
		// TODO Auto-generated method stub
		cr.saveAndFlush(country);
	}
	
	
}
