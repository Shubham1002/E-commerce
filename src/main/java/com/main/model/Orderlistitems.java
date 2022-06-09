package com.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Orderlistitems 
{
	@Id
	@SequenceGenerator(name="generator" ,sequenceName = "seqorderlistitemid" , allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "generator")
	private long orderlistitemId;
	
	@ManyToOne
	@JoinColumn(name = "orderlistId")
	private Orderlist orderlist;
	
	@OneToOne
	@JoinColumn(name = "proddescId")
	private Productdesc prod;
	
	private int qty;
	

	public long getOrderlistitemId() {
		return orderlistitemId;
	}

	public void setOrderlistitemId(long orderlistitemId) {
		this.orderlistitemId = orderlistitemId;
	}

	public Orderlist getOrderlist() {
		return orderlist;
	}

	public void setOrderlist(Orderlist orderlist) {
		this.orderlist = orderlist;
	}

	public Productdesc getProd() {
		return prod;
	}

	public void setProd(Productdesc prod) {
		this.prod = prod;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	@Override
	public String toString() {
		return "Orderlistitems [orderlistitemId=" + orderlistitemId + ", orderlist=" + orderlist + ", prod=" + prod
				+ ", qty=" + qty + "]";
	}

	public Orderlistitems(long orderlistitemId, Orderlist orderlist, Productdesc prod, int qty) {
		super();
		this.orderlistitemId = orderlistitemId;
		this.orderlist = orderlist;
		this.prod = prod;
		this.qty = qty;
	}

	public Orderlistitems() {
		super();
		// TODO Auto-generated constructor stub
	}
}
