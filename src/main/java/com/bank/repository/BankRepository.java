package com.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.bank.entity.Bank;

public interface BankRepository extends JpaRepository<Bank,Integer>{
	@Query(value="select balance from bank_details where acc_no like ?",nativeQuery=true)
	int getBalance(long acNo);

}
