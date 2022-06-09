package com.main.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.model.Orders;
import com.main.repo.Ordersrepo;
import com.main.service.Ordersservice;

@Service
public class OrdersserviceImpl implements Ordersservice
{
	@Autowired
	Ordersrepo or;

	@Override
	public Orders createorders(Orders orders) {
		// TODO Auto-generated method stub
		return or.save(orders);
	}
}
