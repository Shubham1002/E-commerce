package com.main.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.main.model.Customer;

public interface Customerrepo extends JpaRepository<Customer, Long>
{
	public Customer findByCemailAndCpwd(String email,String password);
	public Customer findByCemail(String email);
}
