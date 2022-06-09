package com.main.service;

import com.main.model.Address;

public interface Addressservice 
{
	public Address addsave(Address add);
	public Address getadd(long id);
	public void deleteadd(long id);
}
