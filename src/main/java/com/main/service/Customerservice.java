package com.main.service;

import java.util.List;

import com.main.model.Customer;

public interface Customerservice 
{
	public boolean isvalidcustomer(String email,String passward);
	public Customer getcustomerbyid(long id);
	public Customer getcustomerbyemail(String email);
	public boolean emailduplicatecheck(String email);
	
	public Customer addcustomer(Customer customer);
	public void deletecustomer(long id);
	public List<Customer> getallcustomer();
}
