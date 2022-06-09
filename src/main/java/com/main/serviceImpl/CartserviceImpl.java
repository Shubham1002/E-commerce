package com.main.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.model.Cart;
import com.main.repo.Cartrepo;
import com.main.service.Cartservice;

@Service
public class CartserviceImpl implements Cartservice
{
	@Autowired
	Cartrepo cr;

	@Override
	public Cart createcart(Cart cart) {
		// TODO Auto-generated method stub
		return cr.save(cart);
	}
	
}
