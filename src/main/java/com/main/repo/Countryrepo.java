package com.main.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.main.model.Country;

public interface Countryrepo extends JpaRepository<Country, String>{

}
