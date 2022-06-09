package com.main.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.main.model.Merchant;

public interface Merchantrepo extends JpaRepository<Merchant, Long>
{
	public Merchant findByMemailAndMpwd(String email,String password);
	public Merchant findByMemail(String email);
}
