package com.andromedcodealab.consultafijapoc.customer.repository;

import com.andromedcodealab.consultafijapoc.customer.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    Customer findByDni(Integer dni);
}