package com.main.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Cart 
{
	@Id
	@SequenceGenerator(name="generator" ,sequenceName = "seqcartid" , allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "generator")
	private long cartId;
	
	@OneToOne
	@JoinColumn(name = "cId")
	private Customer cust;
	
	@OneToMany
	@JoinColumn(name = "cartitemId")
	private List<Cartitems> cart;

	
	public long getCartId() {
		return cartId;
	}

	public void setCartId(long cartId) {
		this.cartId = cartId;
	}

	public Customer getCust() {
		return cust;
	}

	public void setCust(Customer cust) {
		this.cust = cust;
	}

	public List<Cartitems> getCart() {
		return cart;
	}

	public void setCart(List<Cartitems> cart) {
		this.cart = cart;
	}

	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", cust=" + cust + ", cart=" + cart + "]";
	}

	public Cart(long cartId, Customer cust, List<Cartitems> cart) {
		super();
		this.cartId = cartId;
		this.cust = cust;
		this.cart = cart;
	}

	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}
}
