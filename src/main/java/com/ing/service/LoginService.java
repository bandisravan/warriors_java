package com.ing.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ing.domain.CustomerInfo;

import com.ing.repository.LoginRepository;

@Service
public class LoginService {

	@Autowired
	LoginRepository loginRepository;

	public CustomerInfo login(int custId, String password, String role) {
		// TODO Auto-generated method stub
		CustomerInfo customerInfo = loginRepository.findByCustId(custId);

		if (customerInfo.getCustId() == custId && customerInfo.getPassword().equals(password)
				&& customerInfo.getRole().equals(role)) {
			customerInfo.setMessage("Success Login");
			customerInfo.setSuccess("true");
			return customerInfo;

		} else {

			customerInfo.setMessage("Invalid Login");
			customerInfo.setSuccess("false");

			return customerInfo;
		}

		// return null;
	}

}
