package com.main.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.model.Product;
import com.main.repo.Productrepo;
import com.main.service.Productservice;

@Service
public class ProductserviceImpl implements Productservice
{
	@Autowired
	Productrepo pr;

	@Override
	public List<Product> findallprod() {
		// TODO Auto-generated method stub
		return pr.findAll();
	}

	@Override
	public Product findprodbyId(long id) {
		// TODO Auto-generated method stub
		return pr.findById(id).get();
	}

	@Override
	public Product addprod(Product prod) {
		// TODO Auto-generated method stub
		return pr.save(prod);
	}

	@Override
	public void deleteprodbyId(long id) {
		// TODO Auto-generated method stub
		pr.deleteById(id);
	}

	@Override
	public List<Product> searchbyprod(String name) {
		// TODO Auto-generated method stub
		return pr.findByProdNameContainingIgnoreCase(name);
	}

	@Override
	public List<Product> searchbysubcat(String name) {
		// TODO Auto-generated method stub
		return pr.findByScat_SubcatNameContainingIgnoreCase(name);
	}

	@Override
	public List<Product> searchbycat(String name) {
		// TODO Auto-generated method stub
		return pr.findByScat_Cat_CatNameContainingIgnoreCase(name);
	}

	@Override
	public Product updateprod(Product prod) {
		// TODO Auto-generated method stub
		return pr.saveAndFlush(prod);
	}
}
