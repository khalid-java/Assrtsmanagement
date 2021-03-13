package com.regmax.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.regmax.model.Furniture;

public interface FurnitureRepository extends JpaRepository<Furniture, Long> {

}
