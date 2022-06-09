package com.main.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.main.model.Orders;

public interface Ordersrepo extends JpaRepository<Orders, Long>{

}
