package com.andromedcodealab.consultafijapoc.customer.service;

import com.andromedcodealab.consultafijapoc.customer.model.Account;
import com.andromedcodealab.consultafijapoc.customer.model.Customer;
import com.andromedcodealab.consultafijapoc.customer.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private AccountService accountService;

    public Customer findCustomerByDni(Integer dni) {
        Customer customer = customerRepository.findByDni(dni);

        List<Account> accounts = accountService.findAllByCustomer(customer);

        customer.setAccounts(accounts);

        return customer;
    }
}
