package com.staragile.swapnil.financeme.dao;

import org.springframework.data.repository.CrudRepository;

import com.staragile.swapnil.financeme.model.Account;

public interface AccountDAO extends CrudRepository<Account, Long> {

}
