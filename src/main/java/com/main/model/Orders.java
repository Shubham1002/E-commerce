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
public class Orders 
{
	@Id
	@SequenceGenerator(name="generator" ,sequenceName = "seqorderid" , allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "generator")
	private long orderId;
	
	@OneToOne
	@JoinColumn(name = "cId")
	private Customer cust;
	
	@OneToMany
	@JoinColumn(name = "orderlistId")
	private List<Orderlist> orderlist;

	
	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public Customer getCust() {
		return cust;
	}

	public void setCust(Customer cust) {
		this.cust = cust;
	}

	public List<Orderlist> getOrderlist() {
		return orderlist;
	}

	public void setOrderlist(List<Orderlist> orderlist) {
		this.orderlist = orderlist;
	}

	@Override
	public String toString() {
		return "Orders [orderId=" + orderId + ", cust=" + cust + ", orderlist=" + orderlist + "]";
	}

	public Orders(long orderId, Customer cust, List<Orderlist> orderlist) {
		super();
		this.orderId = orderId;
		this.cust = cust;
		this.orderlist = orderlist;
	}

	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}
}
