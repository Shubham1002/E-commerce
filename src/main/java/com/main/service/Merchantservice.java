package com.main.service;

import java.util.List;

import com.main.model.Merchant;

public interface Merchantservice 
{
	public boolean isvalidmerchant(String email,String passward);
	public Merchant getmerchantbyid(long id);
	public Merchant getmerchantbyemail(String email);
	public boolean emailduplicatecheck(String email);
	
	public void addmerchant(Merchant merchant);
	public void deletemerchant(long id);
	public List<Merchant> getallmerchant();
}
