package com.main.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.repo.Orderlistitemsrepo;
import com.main.service.Orderlistitemsservice;

@Service
public class OrderlistitemsserviceImpl implements Orderlistitemsservice
{
	@Autowired
	Orderlistitemsrepo olir;
}
