package com.simtlix.consultafijapoc.customer.repository;

import com.simtlix.consultafijapoc.customer.model.InstallationAddress;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InstallationAddressRepository extends JpaRepository<InstallationAddress, Integer> {

    List<InstallationAddress> findInstallationAddressesByAccountId(Integer accountId);
}
