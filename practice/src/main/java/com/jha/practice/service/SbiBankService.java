package com.jha.practice.service;

import java.util.List;
import com.jha.practice.dto.SbiBankDto;

public interface SbiBankService {

	public SbiBankDto save(SbiBankDto sbiBankDto);

	public SbiBankDto getBankByusrId(int userId);

	public void deleteBankByuserId(int userId);

	public List<SbiBankDto> getBankByAll();
}
