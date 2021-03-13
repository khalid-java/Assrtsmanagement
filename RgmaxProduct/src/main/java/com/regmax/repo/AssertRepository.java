package com.regmax.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.regmax.model.Asserts;

public interface AssertRepository extends JpaRepository<Asserts, Long> {

}
