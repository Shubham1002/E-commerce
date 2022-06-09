package com.main.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.repo.Productdescrepo;
import com.main.service.Proddescservice;

@Service
public class ProddescserviceImpl implements Proddescservice
{
	@Autowired
	Productdescrepo pdr;
}
