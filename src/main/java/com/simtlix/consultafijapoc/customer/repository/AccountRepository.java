package com.simtlix.consultafijapoc.customer.repository;

import com.simtlix.consultafijapoc.customer.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface AccountRepository extends JpaRepository<Account, Integer> {
    Set<Account> findAllByClientId(Integer clientId);
}
