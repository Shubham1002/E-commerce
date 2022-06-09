package com.main.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.model.Address;
import com.main.repo.Addressrepo;
import com.main.service.Addressservice;

@Service
public class AddressserviceImpl implements Addressservice
{
	@Autowired
	Addressrepo ar;

	@Override
	public Address addsave(Address add) {
		// TODO Auto-generated method stub
		return ar.save(add);
	}

	@Override
	public Address getadd(long id) {
		// TODO Auto-generated method stub
		return ar.findById(id).get();
	}

	@Override
	public void deleteadd(long id) {
		// TODO Auto-generated method stub
		ar.deleteById(id);
	}
}
