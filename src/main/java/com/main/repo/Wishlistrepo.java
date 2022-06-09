package com.main.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.main.model.Wishlist;

public interface Wishlistrepo extends JpaRepository<Wishlist, Long>{

}
