package com.example.coustomerservice.repository;

import com.example.coustomerservice.entity.Coustomer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Coustomer, Integer> {
}
