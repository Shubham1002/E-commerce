package com.main.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.repo.Orderlistrepo;
import com.main.service.Orderlistservice;

@Service
public class OrderlistserviceImpl implements Orderlistservice
{
	@Autowired
	Orderlistrepo olr;
}
