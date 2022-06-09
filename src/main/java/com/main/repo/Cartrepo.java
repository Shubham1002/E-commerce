package com.main.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.main.model.Cart;

public interface Cartrepo extends JpaRepository<Cart, Long>{

}
