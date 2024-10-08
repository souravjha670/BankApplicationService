package com.jha.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.jha.practice.entity.BankOfBarodaBank;

public interface BankOfBarodaRepository extends JpaRepository<BankOfBarodaBank,Integer>{

	Object findByName(String name);

	Object getByName(String name);

	


}
