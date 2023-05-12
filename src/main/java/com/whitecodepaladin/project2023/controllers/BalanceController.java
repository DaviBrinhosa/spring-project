package com.whitecodepaladin.project2023.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.whitecodepaladin.project2023.dto.BalanceDTO;
import com.whitecodepaladin.project2023.services.BalanceService;

@RestController
@RequestMapping(value = "/balance")
public class BalanceController {
	
	@Autowired
	private BalanceService balanceService;
	
	@GetMapping
	public List<BalanceDTO> findAll() {
		List<BalanceDTO> result = balanceService.findAll();
		return result;
	}
	
	@GetMapping(value = "/{id}")
	public BalanceDTO findById(@PathVariable Long id) {
		BalanceDTO result = balanceService.findById(id);
		return result;
	}

}
