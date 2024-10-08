package com.jha.practice.serviceimpl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jha.practice.dto.BankOfBarodaDto;
import com.jha.practice.entity.BankOfBarodaBank;
import com.jha.practice.repository.BankOfBarodaRepository;
import com.jha.practice.service.BankOfBarodaService;

@Service
public class BankOfBarodaSeriviceImpl implements BankOfBarodaService {
	@Autowired
	private BankOfBarodaRepository bankOfBarodaRepository;
	@Autowired
	private ModelMapper modelMapper;

	public BankOfBarodaDto save(BankOfBarodaDto bankOfBarodaDto) {
		BankOfBarodaBank bob = modelMapper.map(bankOfBarodaDto, BankOfBarodaBank.class);
		bob = bankOfBarodaRepository.save(bob);
		return modelMapper.map(bob, BankOfBarodaDto.class);
	}

	public BankOfBarodaDto getBankByusrId(int userId) {
		BankOfBarodaBank bob = bankOfBarodaRepository.findById(userId)
				.orElseThrow(() -> new RuntimeException("Product not found"));
		return modelMapper.map(bob, BankOfBarodaDto.class);
	}

	@Override
	public void deleteBankByuserId(int userId) {
		if (!bankOfBarodaRepository.existsById(userId)) {
			throw new RuntimeException("Product not found");
		}
		bankOfBarodaRepository.deleteById(userId);
	}

	@Override
	public List<BankOfBarodaDto> getBankByAll() {
		return bankOfBarodaRepository.findAll().stream().map(bob -> modelMapper.map(bob, BankOfBarodaDto.class))
				.collect(Collectors.toList());
	}

}
