package com.bank.dao;
// HI SANTO
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
		bankRepo.save(bank);
		return "Saved bank detail";
	}

	public String setAllBankDetail(List<Bank> banks) {
		bankRepo.saveAll(banks);
		return "Saved banks details";
	}

	public int getBalance(long acNo) {
		return bankRepo.getBalance(acNo);
	}

}
