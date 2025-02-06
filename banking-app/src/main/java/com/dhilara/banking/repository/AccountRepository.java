package com.dhilara.banking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dhilara.banking.model.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long>{

}
