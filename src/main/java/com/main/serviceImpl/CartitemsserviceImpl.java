package com.main.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.repo.Cartitemsrepo;
import com.main.service.Cartitemsservice;

@Service
public class CartitemsserviceImpl implements Cartitemsservice
{
	@Autowired
	Cartitemsrepo cir;
	
	
}
