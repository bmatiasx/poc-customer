package com.simtlix.consultafijapoc.customer.service;

import com.simtlix.consultafijapoc.customer.model.Account;
import com.simtlix.consultafijapoc.customer.model.Customer;
import com.simtlix.consultafijapoc.customer.model.InstallationAddress;
import com.simtlix.consultafijapoc.customer.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private InstallationAddressService installationAddressService;

    public List<Account> findAccountsByCustomer(Customer customer) {
        List<InstallationAddress> installationAddresses;
        Set<Account> accounts = accountRepository.findByClientId(customer.getClientId());
        List<Account> customerAccounts = new ArrayList<>();

        for (Account account : accounts) {
            Account customerAccount = new Account();
            installationAddresses = installationAddressService.findInstallationAddressesByAccountId(account.getAccountId());
            customerAccount.setAccountId(account.getAccountId());
            customerAccount.setInstallationAddresses(installationAddresses);
            customerAccounts.add(customerAccount);
        }

        return customerAccounts;
    }
}
