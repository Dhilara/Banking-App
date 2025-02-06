package com.dhilara.banking.service;

import java.util.List;

import com.dhilara.banking.dto.AccountDto;

public interface AccountService {
	
	AccountDto createAccount(AccountDto account);
	
	AccountDto getAccountById(Long id);
	
	AccountDto deposit(Long id, Double amount);
	
	AccountDto withdraw(Long id, Double amount);
	
	List<AccountDto> getAllAccounts();
	
	void deleteAccount(Long id);

}
