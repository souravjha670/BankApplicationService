package com.jha.practice.serviceimpl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jha.practice.dto.HdfcBankDto;

import com.jha.practice.entity.HdfcBank;
import com.jha.practice.repository.HdfcBankRepository;
import com.jha.practice.service.HdfcBankService;

@Service
public class HdfcBankImpl implements HdfcBankService {
	@Autowired
	private HdfcBankRepository hdfcBankRepository;
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public HdfcBankDto save(HdfcBankDto hdfcBankDto) {
		HdfcBank hdf = modelMapper.map(hdfcBankDto, HdfcBank.class);
		hdf = hdfcBankRepository.save(hdf);
		return modelMapper.map(hdf, HdfcBankDto.class);
	}

	@Override
	public HdfcBankDto getBankByusrId(int userId) {
		HdfcBank hdf = hdfcBankRepository.findById(userId).orElseThrow(() -> new RuntimeException("Product not found"));
		return modelMapper.map(hdf, HdfcBankDto.class);
	}

	@Override
	public void deleteBankByuserId(int userId) {
		if (!hdfcBankRepository.existsById(userId)) {
			throw new RuntimeException("Product not found");
		}
		hdfcBankRepository.deleteById(userId);

	}

	@Override
	public List<HdfcBankDto> getBankByAll() {
		return hdfcBankRepository.findAll().stream().map(hdf -> modelMapper.map(hdf, HdfcBankDto.class))
				.collect(Collectors.toList());
	}

}
