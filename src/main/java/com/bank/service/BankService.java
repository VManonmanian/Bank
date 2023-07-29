package com.bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.dao.BankDao;
import com.bank.entity.Bank;

@Service
public class BankService {
	@Autowired
	BankDao bankDao;
	public String setBankDetail(Bank bank) {
		// TODO Auto-generated method stub
		return bankDao.setBankDetail(bank);
	}

	public String setAllBankDetails(List<Bank> banks) {
		// TODO Auto-generated method stub
		return bankDao.setAllBankDetail(banks);
	}

	public int getBalance(long acNo) {
		// TODO Auto-generated method stub
		return bankDao.getBalance(acNo);
	}

}
