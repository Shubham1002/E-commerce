package com.main.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.repo.Prodratingsrepo;
import com.main.service.Productratingsservice;

@Service
public class ProductratingsserviceImpl implements Productratingsservice
{
	@Autowired
	Prodratingsrepo prr;
}
