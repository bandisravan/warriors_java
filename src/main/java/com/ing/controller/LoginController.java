package com.ing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ing.domain.CustomerInfo;
import com.ing.domain.Login;
import com.ing.service.LoginService;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@CrossOrigin
@RestController
@EnableSwagger2
@RequestMapping("/api")
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	@RequestMapping(value="/login",method=RequestMethod.POST,consumes="application/json" )
	public CustomerInfo login(@RequestBody CustomerInfo customerInfo) {
		CustomerInfo reviewHistory1= loginService.login(customerInfo.getCustId(),customerInfo.getPassword(),customerInfo.getRole());
		
		return reviewHistory1;
	}

	

}
