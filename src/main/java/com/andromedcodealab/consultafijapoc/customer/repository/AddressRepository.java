package com.andromedcodealab.consultafijapoc.customer.repository;

import com.andromedcodealab.consultafijapoc.customer.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AddressRepository extends JpaRepository<Address, Long> {

    List<Address> findAllByAccountId(Long accountId);
}
