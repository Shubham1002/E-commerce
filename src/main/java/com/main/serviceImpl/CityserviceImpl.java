package com.main.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.model.City;
import com.main.repo.Cityrepo;
import com.main.service.Cityservice;

@Service
public class CityserviceImpl implements Cityservice
{
	@Autowired
	Cityrepo cr;

	@Override
	public void saveall(List<City> city) {
		// TODO Auto-generated method stub
		cr.saveAll(city);
	}

	@Override
	public void savcity(City city) {
		// TODO Auto-generated method stub
		cr.save(city);
	}

	@Override
	public City getcity(long id) {
		// TODO Auto-generated method stub
		return cr.findById(id).get();
	}

	@Override
	public List<City> getallcity() {
		// TODO Auto-generated method stub
		List<City> lst=cr.findAll();
		return lst;
	}

	@Override
	public void updateCity(City city) {
		// TODO Auto-generated method stub
		cr.saveAndFlush(city);
	}

	@Override
	public List<City> findbystateid(String stateId) {
		// TODO Auto-generated method stub
		return cr.findByState_StateId(stateId);
	}

	@Override
	public List<City> searchbycityname(String cityname) {
		// TODO Auto-generated method stub
		return cr.findByCityNameContainingIgnoreCase(cityname);
	}
}
