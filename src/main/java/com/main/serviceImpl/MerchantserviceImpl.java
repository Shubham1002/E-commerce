package com.main.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.model.Merchant;
import com.main.repo.Merchantrepo;
import com.main.service.Merchantservice;

@Service
public class MerchantserviceImpl implements Merchantservice
{
	@Autowired
	Merchantrepo mrepo;

	@Override
	public boolean isvalidmerchant(String email, String passward) {
		// TODO Auto-generated method stub
		Merchant obj=mrepo.findByMemailAndMpwd(email, passward);
		if(obj == null)
		{
			return false;
		}
		else
		{
			return true;
		}
	}

	@Override
	public Merchant getmerchantbyid(long id) {
		// TODO Auto-generated method stub
		return mrepo.findById(id).get();
	}

	@Override
	public Merchant getmerchantbyemail(String email) {
		// TODO Auto-generated method stub
		return mrepo.findByMemail(email);
	}

	@Override
	public boolean emailduplicatecheck(String email) {
		// TODO Auto-generated method stub
		Merchant obj=mrepo.findByMemail(email);
		if(obj ==null)
		{
			return false;
		}
		else
		{
			return true;
		}
	}

	@Override
	public void addmerchant(Merchant merchant) {
		// TODO Auto-generated method stub
		mrepo.save(merchant);
	}

	@Override
	public void deletemerchant(long id) {
		// TODO Auto-generated method stub
		mrepo.deleteById(id);
	}

	@Override
	public List<Merchant> getallmerchant() {
		// TODO Auto-generated method stub
		List<Merchant> lst=mrepo.findAll();
		return lst;
	}
	
	
}
