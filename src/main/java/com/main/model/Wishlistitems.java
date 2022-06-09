package com.main.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Wishlistitems 
{
	@Id
	@SequenceGenerator(name="generator" ,sequenceName = "seqwishlistitemid" , allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "generator")
	private long wishlistitemId;
	
	@ManyToOne
	@JoinColumn(name = "wishlistId")
	private Wishlist wishlist;
	
	@OneToOne
	@JoinColumn(name = "proddescId")
	private Productdesc prod;
	
	private LocalDateTime wishedDate;

	
	public long getWishlistitemId() {
		return wishlistitemId;
	}

	public void setWishlistitemId(long wishlistitemId) {
		this.wishlistitemId = wishlistitemId;
	}

	public Wishlist getWishlist() {
		return wishlist;
	}

	public void setWishlist(Wishlist wishlist) {
		this.wishlist = wishlist;
	}

	public Productdesc getProd() {
		return prod;
	}

	public void setProd(Productdesc prod) {
		this.prod = prod;
	}

	public LocalDateTime getWishedDate() {
		return wishedDate;
	}

	public void setWishedDate(LocalDateTime wishedDate) {
		this.wishedDate = wishedDate;
	}

	@Override
	public String toString() {
		return "Wishlistitems [wishlistitemId=" + wishlistitemId + ", wishlist=" + wishlist + ", prod=" + prod
				+ ", wishedDate=" + wishedDate + "]";
	}

	public Wishlistitems(long wishlistitemId, Wishlist wishlist, Productdesc prod, LocalDateTime wishedDate) {
		super();
		this.wishlistitemId = wishlistitemId;
		this.wishlist = wishlist;
		this.prod = prod;
		this.wishedDate = wishedDate;
	}

	public Wishlistitems() {
		super();
		// TODO Auto-generated constructor stub
	}
}
