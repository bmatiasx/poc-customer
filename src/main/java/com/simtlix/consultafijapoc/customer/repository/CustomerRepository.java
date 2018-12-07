package com.simtlix.consultafijapoc.customer.repository;

import com.simtlix.consultafijapoc.customer.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    List<Customer> findAll();

    Customer findByDni(Integer dni);
}