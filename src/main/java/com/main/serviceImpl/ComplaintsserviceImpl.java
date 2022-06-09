package com.main.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.repo.Complaintsrepo;
import com.main.service.Complaintsservice;

@Service
public class ComplaintsserviceImpl implements Complaintsservice
{
	@Autowired
	Complaintsrepo cr;
}
