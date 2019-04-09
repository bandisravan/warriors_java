package com.ing.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ing.domain.BankInfo;
import com.ing.service.TransactionService;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@CrossOrigin
@RestController
@EnableSwagger2
@RequestMapping("api/v1/")
public class TransactionController {
	
	@Autowired
	TransactionService transactionService;
	
	@Autowired
	Optional<BankInfo> bankinfo;
	
	@GetMapping("/transferAmount")
	public Optional<BankInfo> transferAmount(int custId, Double amt) {
		
		return transactionService.getCustomerBankAcc(custId, amt);
		
		
	}

}
