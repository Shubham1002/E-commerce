package com.main.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.main.model.Product;

public interface Productrepo extends JpaRepository<Product, Long>
{
	public List<Product> findByProdNameContainingIgnoreCase(String name);
	public List<Product> findByScat_Cat_CatNameContainingIgnoreCase(String name);
	public List<Product> findByScat_SubcatNameContainingIgnoreCase(String name);
}
