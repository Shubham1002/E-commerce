package com.main.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.model.Wishlist;
import com.main.repo.Wishlistrepo;
import com.main.service.Wishlistservice;

@Service
public class WishlistserviceImpl implements Wishlistservice
{
	@Autowired
	Wishlistrepo wr;

	@Override
	public Wishlist createwishlist(Wishlist wishlist) {
		// TODO Auto-generated method stub
		return wr.save(wishlist);
	}
}
