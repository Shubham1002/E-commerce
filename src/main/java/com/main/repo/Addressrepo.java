package com.main.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.main.model.Address;

public interface Addressrepo extends JpaRepository<Address, Long>{

}
