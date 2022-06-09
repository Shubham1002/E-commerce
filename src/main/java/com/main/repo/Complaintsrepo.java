package com.main.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.main.model.Complaints;

public interface Complaintsrepo extends JpaRepository<Complaints, Long>{

}
