package com.jha.practice.service;

import java.util.List;

import com.jha.practice.dto.HdfcBankDto;

public interface HdfcBankService {
	public HdfcBankDto save(HdfcBankDto hdfcBankDto);

	public HdfcBankDto getBankByusrId(int userId);

	public void deleteBankByuserId(int userId);

	public List<HdfcBankDto> getBankByAll();
}
