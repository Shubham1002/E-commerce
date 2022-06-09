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
public class Cartitems 
{
	@Id
	@SequenceGenerator(name = "generator" , sequenceName = "seqcartitemid" , allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "generator")
	private long cartitemId;
	
	@ManyToOne
	@JoinColumn(name = "cartId")
	private Cart cart;
	
	@OneToOne 
	@JoinColumn(name = "proddescId")
	private Productdesc prod;
	
	private int Qty;
	
	private LocalDateTime cdate;
	

	public long getCartitemId() {
		return cartitemId;
	}

	public void setCartitemId(long cartitemId) {
		this.cartitemId = cartitemId;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public Productdesc getProd() {
		return prod;
	}

	public void setProd(Productdesc prod) {
		this.prod = prod;
	}

	public int getQty() {
		return Qty;
	}

	public void setQty(int qty) {
		Qty = qty;
	}

	public LocalDateTime getDate() {
		return cdate;
	}

	public void setDate(LocalDateTime date) {
		this.cdate = date;
	}

	@Override
	public String toString() {
		return "Cartitems [cartitemId=" + cartitemId + ", cart=" + cart + ", prod=" + prod + ", Qty=" + Qty + ", date="
				+ cdate + "]";
	}

	public Cartitems(long cartitemId, Cart cart, Productdesc prod, int qty, LocalDateTime cdate) {
		super();
		this.cartitemId = cartitemId;
		this.cart = cart;
		this.prod = prod;
		Qty = qty;
		this.cdate = cdate;
	}

	public Cartitems() {
		super();
		// TODO Auto-generated constructor stub
	}
}
