package com.jha.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jha.practice.dto.BankOfBarodaDto;
import com.jha.practice.service.BankOfBarodaService;


@RestController
@RequestMapping("/map")
public class BankOfBarodaController {
	
	@Autowired
    private BankOfBarodaService bankOfBarodaService ;
	
	@PostMapping("/bob")
	public ResponseEntity<BankOfBarodaDto> saveProducts (@RequestBody  BankOfBarodaDto bankOfBarodaDto) {
		BankOfBarodaDto bob = bankOfBarodaService.save(bankOfBarodaDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(bob);
	}
	@GetMapping("/bobyname")
	public ResponseEntity<BankOfBarodaDto> getBankByName (@RequestBody  BankOfBarodaDto bankOfBarodaDto) {
		BankOfBarodaDto bob = bankOfBarodaService.save(bankOfBarodaDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(bob);
}
}