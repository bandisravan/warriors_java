package com.ing.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ing.domain.BankInfo;
import com.ing.repository.TransactionRepository;

@Service
@Transactional
public class TransactionService {

	@Autowired
	TransactionRepository transactionrepo;

	public Optional<BankInfo> getCustomerBankAcc(int custId, Double amt) {
		Long id = (long) custId;
		Double acc_balance = null;
		Optional<BankInfo> bankinfo = transactionrepo.findById(id);
		acc_balance = bankinfo.get().getBalance() - amt;

		bankinfo.get().setCustId(custId);
		bankinfo.get().setBalance(acc_balance);
		transactionrepo.save(bankinfo);

		return bankinfo;
	}

}
