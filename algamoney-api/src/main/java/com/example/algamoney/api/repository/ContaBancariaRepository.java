package com.example.algamoney.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.algamoney.api.model.ContaBancaria;


public interface ContaBancariaRepository extends JpaRepository<ContaBancaria, Long> {
	
}