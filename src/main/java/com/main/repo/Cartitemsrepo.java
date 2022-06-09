package com.main.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.main.model.Cartitems;

public interface Cartitemsrepo extends JpaRepository<Cartitems, Long>{

}
