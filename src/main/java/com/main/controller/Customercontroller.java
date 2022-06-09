package com.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.main.model.Cart;
import com.main.model.Customer;
import com.main.model.Orders;
import com.main.model.User;
import com.main.model.Wishlist;
import com.main.service.Cartservice;
import com.main.service.Customerservice;
import com.main.service.Ordersservice;
import com.main.service.Wishlistservice;

@RestController
@CrossOrigin(origins="*")
public class Customercontroller 
{
	@Autowired
	Customerservice cs;
	@Autowired
	Cartservice carts;
	@Autowired
	Ordersservice orders;
	@Autowired
	Wishlistservice wishlists;
	
	@PostMapping("/customer/save")
	public Customer addcustomer(@RequestBody Customer cust)
	{
		Customer obj=cs.addcustomer(cust);
		if(obj == null)
		{
			return null;
		}
		else
		{
			Cart cart=new Cart(0, obj, null);
			carts.createcart(cart);
			Orders order=new Orders(0, obj, null);
			orders.createorders(order);
			Wishlist wish=new Wishlist(0, obj, null);
			wishlists.createwishlist(wish);
			return obj;
		}
	}
	
	@PostMapping("/customer/login")
	public boolean isvalidcustomer(@RequestBody User user)
	{
		String email=user.getEmail();
		String pass=user.getPwd();
		return cs.isvalidcustomer(email, pass);
	}
	
	@GetMapping("/customer/e/{email}")
	public Customer getcustomerbyemail(@PathVariable("email") String email)
	{
		return cs.getcustomerbyemail(email);
	}
	
	@GetMapping("/customer/{id}")
	public Customer getcustomerbyid(@PathVariable("id") long id)
	{
		return cs.getcustomerbyid(id);
	}
	
	@GetMapping("/customer/{id}/delete")
	public void deletecustomerbyid(@PathVariable("id") long id)
	{
		cs.deletecustomer(id);
	}
	
	@GetMapping("/customer")
	public List<Customer> getallcustomer()
	{
		return cs.getallcustomer();
	}
}
