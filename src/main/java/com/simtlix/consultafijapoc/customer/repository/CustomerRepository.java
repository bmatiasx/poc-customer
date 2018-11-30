package com.simtlix.consultafijapoc.customer.repository;

import com.simtlix.consultafijapoc.customer.model.Customer;
import org.springframework.data.repository.Repository;
import java.util.List;

public interface CustomerRepository extends Repository<Customer, Integer> {

    List<Customer> findAll();

    Customer findByDni(Integer dni);
}