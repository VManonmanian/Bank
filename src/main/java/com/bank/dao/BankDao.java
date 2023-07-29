package com.bank.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bank.entity.Bank;
import com.bank.repository.BankRepository;
@Repository
public class BankDao {
	@Autowired
	BankRepository bankRepo;
	public String setBankDetail(Bank bank) {
		// TODO Auto-generated method stub
		bankRepo.save(bank);
		return "Saved bank detail";
	}

	public String setAllBankDetail(List<Bank> banks) {
		// TODO Auto-generated method stub
		bankRepo.saveAll(banks);
		return "Saved banks details";
	}

	public int getBalance(long acNo) {
		// TODO Auto-generated method stub
		return bankRepo.getBalance(acNo);
	}

}
