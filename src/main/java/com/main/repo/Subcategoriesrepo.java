package com.main.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.main.model.SubCategories;

public interface Subcategoriesrepo extends JpaRepository<SubCategories, Long>
{
}
