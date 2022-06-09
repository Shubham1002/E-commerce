package com.main.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.repo.Wishlistitemsrepo;
import com.main.service.Wishlistitemsservice;

@Service
public class WishlistitemsserviceImpl implements Wishlistitemsservice
{
	@Autowired
	Wishlistitemsrepo wir;
}
