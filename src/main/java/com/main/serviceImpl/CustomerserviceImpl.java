package com.main.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.model.Customer;
import com.main.repo.Customerrepo;
import com.main.service.Customerservice;

@Service
public class CustomerserviceImpl implements Customerservice
{
	@Autowired
	Customerrepo cr;

	@Override
	public boolean isvalidcustomer(String email, String passward) {
		// TODO Auto-generated method stub
		Customer obj=cr.findByCemailAndCpwd(email, passward);
		if(obj==null)
		{
			return false;
		}
		else
		{
			return true;
		}
	}

	@Override
	public Customer getcustomerbyid(long id) {
		// TODO Auto-generated method stub
		return cr.findById(id).get();
	}

	@Override
	public Customer getcustomerbyemail(String email) {
		// TODO Auto-generated method stub
		return cr.findByCemail(email);
	}

	@Override
	public boolean emailduplicatecheck(String email) {
		// TODO Auto-generated method stub
		Customer obj=cr.findByCemail(email);
		if(obj==null)
		{
			return false;
		}
		else
		{
			return true;
		}
	}

	@Override
	public Customer addcustomer(Customer customer) {
		// TODO Auto-generated method stub
		return cr.save(customer);
	}

	@Override
	public void deletecustomer(long id) {
		// TODO Auto-generated method stub
		cr.deleteById(id);
	}

	@Override
	public List<Customer> getallcustomer() {
		// TODO Auto-generated method stub
		List<Customer> lst=cr.findAll();
		return lst;
	}
}
