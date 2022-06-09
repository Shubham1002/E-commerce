package com.main.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.main.model.State;

public interface Staterepo extends JpaRepository<State, String>{
	public List<State> findByCountry_CountryId(String countryId);

}
