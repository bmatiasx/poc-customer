package com.simtlix.consultafijapoc.customer.service;

import com.simtlix.consultafijapoc.customer.model.Customer;
import com.simtlix.consultafijapoc.customer.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private Customer customer;

    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> getAllCustomers() throws SQLException {
        return customerRepository.findAll();
    }
}
