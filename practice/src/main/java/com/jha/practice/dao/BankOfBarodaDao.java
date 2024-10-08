package com.jha.practice.dao;

import java.util.List;

import com.jha.practice.dto.BankOfBarodaDto;

public interface BankOfBarodaDao {
	public BankOfBarodaDto save(BankOfBarodaDto bankOfBarodaDto);

	public BankOfBarodaDto getBankByusrId(int userId);

	public void deleteBankByuserId(int userId);

	public List<BankOfBarodaDto> getBankByAll();

	BankOfBarodaDto getBankByName(String name);

	
}
