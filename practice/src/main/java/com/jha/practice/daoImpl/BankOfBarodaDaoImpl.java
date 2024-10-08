package com.jha.practice.daoImpl;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.jha.practice.dao.BankOfBarodaDao;
import com.jha.practice.dto.BankOfBarodaDto;
import com.jha.practice.entity.BankOfBarodaBank;
import com.jha.practice.repository.BankOfBarodaRepository;

public class BankOfBarodaDaoImpl implements BankOfBarodaDao {
	@Autowired
	private BankOfBarodaRepository bankOfBarodaRepository;
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public BankOfBarodaDto save(BankOfBarodaDto bankOfBarodaDto) {
		BankOfBarodaBank bob = modelMapper.map(bankOfBarodaDto, BankOfBarodaBank.class);
		bob = bankOfBarodaRepository.save(bob);
		return modelMapper.map(bob, BankOfBarodaDto.class);
	}

	@Override
	public BankOfBarodaDto getBankByName(String name) {
	    BankOfBarodaBank bob = (BankOfBarodaBank) bankOfBarodaRepository.getByName(name);
	    return modelMapper.map(bob, BankOfBarodaDto.class);
	}

	@Override
	public void deleteBankByuserId(int userId) {
		

	}

	@Override
	public List<BankOfBarodaDto> getBankByAll() {
		
		return null;
	}

	@Override
	public BankOfBarodaDto getBankByusrId(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
