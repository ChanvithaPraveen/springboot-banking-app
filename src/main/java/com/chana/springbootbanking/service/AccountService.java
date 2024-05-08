package com.chana.springbootbanking.service;

import com.chana.springbootbanking.dto.AccountDto;

public interface AccountService {

    AccountDto createAccount(AccountDto accountDto);

    AccountDto getAccountById(Long id);
}
