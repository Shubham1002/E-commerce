package com.main.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.main.model.Category;

public interface Categoryrepo extends JpaRepository<Category, Long>
{
}
