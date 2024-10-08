package com.jha.practice.service;

import java.util.List;

import com.jha.practice.dto.BankOfBarodaDto;

public interface BankOfBarodaService {
	public BankOfBarodaDto save(BankOfBarodaDto bankOfBarodaDto);

	public BankOfBarodaDto getBankByusrId(int userId);

	public void deleteBankByuserId(int userId);

	public List<BankOfBarodaDto> getBankByAll();
}
