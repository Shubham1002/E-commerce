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
public class Wishlist 
{
	@Id
	@SequenceGenerator(name="generator" ,sequenceName = "seqwishlistid" , allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "generator")
	private long wishlistId;
	
	@OneToOne
	@JoinColumn(name = "cId")
	private Customer cust;
	
	@OneToMany
	@JoinColumn(name = "wishlistitemId")
	private List<Wishlistitems> wishlist;

	
	public long getWishlistId() {
		return wishlistId;
	}

	public void setWishlistId(long wishlistId) {
		this.wishlistId = wishlistId;
	}

	public Customer getCust() {
		return cust;
	}

	public void setCust(Customer cust) {
		this.cust = cust;
	}

	public List<Wishlistitems> getWishlist() {
		return wishlist;
	}

	public void setWishlist(List<Wishlistitems> wishlist) {
		this.wishlist = wishlist;
	}

	@Override
	public String toString() {
		return "Wishlist [wishlistId=" + wishlistId + ", cust=" + cust + ", wishlist=" + wishlist + "]";
	}

	public Wishlist(long wishlistId, Customer cust, List<Wishlistitems> wishlist) {
		super();
		this.wishlistId = wishlistId;
		this.cust = cust;
		this.wishlist = wishlist;
	}

	public Wishlist() {
		super();
		// TODO Auto-generated constructor stub
	}
}
