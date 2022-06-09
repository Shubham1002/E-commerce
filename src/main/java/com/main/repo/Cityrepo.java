package com.main.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.main.model.City;

public interface Cityrepo extends JpaRepository<City, Long>
{
	public List<City> findByState_StateId(String stateId);
	public List<City> findByCityNameContainingIgnoreCase(String cityname);
}
