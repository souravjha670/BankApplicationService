package com.jha.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.jha.practice.dto.HdfcBankDto;

import com.jha.practice.service.HdfcBankService;

@RestController
@RequestMapping("/map")
public class HdfcBankController {
	
	@Autowired
    private HdfcBankService productService;
	
	@PostMapping("/hdfc")
	public ResponseEntity<HdfcBankDto> saveProducts (@RequestBody  HdfcBankDto hdfcBankDto) {
		HdfcBankDto hdf = productService.save(hdfcBankDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(hdf);
	}

}
