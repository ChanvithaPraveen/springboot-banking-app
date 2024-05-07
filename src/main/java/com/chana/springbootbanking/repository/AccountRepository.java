package com.chana.springbootbanking.repository;

import com.chana.springbootbanking.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {

}
