package com.regmax.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.regmax.model.Electronic;

public interface ElectronicRepository extends JpaRepository<Electronic,Long> {
}
