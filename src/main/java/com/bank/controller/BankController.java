package com.bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bank.entity.Bank;
import com.bank.service.BankService;
@RestController
public class BankController {
	@Autowired
	BankService bankSer;
	@PostMapping("/setBankDetail")
	public String setBankDetail(@RequestBody Bank bank) {
		return bankSer.setBankDetail(bank);
	}
	@PostMapping("/setAllBankDetails")
	public String setAllBankDetail(@RequestBody List<Bank> banks){
		return bankSer.setAllBankDetails(banks);
	}
	@GetMapping("/getBalanceByAccNo/{acNo}")
	public int getBalance(@PathVariable long acNo) {
		return bankSer.getBalance(acNo);
	}
	
}
