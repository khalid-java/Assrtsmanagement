package com.regmax.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.regmax.model.Category;

public interface  CategoryRepository extends JpaRepository<Category, Long>{

    
	
}
