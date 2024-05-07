package com.chana.springbootbanking.service.impl;

import com.chana.springbootbanking.dto.AccountDto;
import com.chana.springbootbanking.entity.Account;
import com.chana.springbootbanking.mapper.AccountMapper;
import com.chana.springbootbanking.repository.AccountRepository;
import com.chana.springbootbanking.service.AccountService;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    private AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public AccountDto createAccount(AccountDto accountDto) {
        Account account = AccountMapper.mapToAccount(accountDto);
        Account savedAccount = accountRepository.save(account);
        return AccountMapper.mapToAccountDto(savedAccount);
    }
}
