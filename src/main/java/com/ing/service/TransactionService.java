package com.ing.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ing.domain.BankInfo;
import com.ing.repository.TransactionRepository;

@Service
public class TransactionService {

	@Autowired
	TransactionRepository transactionrepo;

	public BankInfo getCustomerBankAcc(int custId, Double amt) {
		Double acc_balance = null;
		BankInfo bankinfo= transactionrepo.findByCustId(custId);
		
		
		System.out.println("bankinfo   "+bankinfo);
		acc_balance = bankinfo.getBalance() - amt;

		bankinfo.setCustId(custId);
		bankinfo.setBalance(acc_balance);
		transactionrepo.save(bankinfo);

		return bankinfo;
	}

}
