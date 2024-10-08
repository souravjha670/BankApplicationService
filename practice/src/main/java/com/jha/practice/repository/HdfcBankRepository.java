package com.jha.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jha.practice.entity.HdfcBank;

public interface HdfcBankRepository extends JpaRepository<HdfcBank,Integer>{

}
