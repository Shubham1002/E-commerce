package com.main.model;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Orderlist 
{
	@Id
	@SequenceGenerator(name="generator" ,sequenceName = "seqorderlistid" , allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "generator")
	private long orderlistId;
	
	@ManyToOne
	@JoinColumn(name = "orderId")
	private Orders order;
	
	@OneToMany
	@JoinColumn(name = "orderlistitemId")
	private List<Orderlistitems> orderlist;
	
	private long totalamount;
	
	private LocalDateTime orderedDate;
	
	private Byte bill;

	
	public long getOrderlistId() {
		return orderlistId;
	}

	public void setOrderlistId(long orderlistId) {
		this.orderlistId = orderlistId;
	}

	public Orders getOrder() {
		return order;
	}

	public void setOrder(Orders order) {
		this.order = order;
	}

	public List<Orderlistitems> getOrderlist() {
		return orderlist;
	}

	public void setOrderlist(List<Orderlistitems> orderlist) {
		this.orderlist = orderlist;
	}

	public long getTotalamount() {
		return totalamount;
	}

	public void setTotalamount(long totalamount) {
		this.totalamount = totalamount;
	}

	public LocalDateTime getOrderedDate() {
		return orderedDate;
	}

	public void setOrderedDate(LocalDateTime orderedDate) {
		this.orderedDate = orderedDate;
	}

	public Byte getBill() {
		return bill;
	}

	public void setBill(Byte bill) {
		this.bill = bill;
	}

	@Override
	public String toString() {
		return "Orderlist [orderlistId=" + orderlistId + ", order=" + order + ", orderlist=" + orderlist
				+ ", totalamount=" + totalamount + ", orderedDate=" + orderedDate + ", bill=" + bill + "]";
	}

	public Orderlist(long orderlistId, Orders order, List<Orderlistitems> orderlist, long totalamount,
			LocalDateTime orderedDate, Byte bill) {
		super();
		this.orderlistId = orderlistId;
		this.order = order;
		this.orderlist = orderlist;
		this.totalamount = totalamount;
		this.orderedDate = orderedDate;
		this.bill = bill;
	}

	public Orderlist() {
		super();
		// TODO Auto-generated constructor stub
	}
}
