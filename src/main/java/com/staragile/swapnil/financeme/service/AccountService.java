package com.staragile.swapnil.financeme.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.staragile.swapnil.financeme.dao.AccountDAO;
import com.staragile.swapnil.financeme.model.Account;

@Service
public class AccountService {
	
	@Autowired
	private AccountDAO accountDAO;
 
	public void createAccount(Account ac) {
		accountDAO.save(ac);
	}
	
	public void updateAccount(Account ac) {
		accountDAO.save(ac);
	}
	
	public Optional<Account> viewPolicy(long ac) {
		return accountDAO.findById(ac);
	}
	
	public void deletePolicy(long ac) {
		accountDAO.deleteById(ac);
	}
	
	public List<Account> viewAll() {
		return (List<Account>)accountDAO.findAll();
	}
	
}
