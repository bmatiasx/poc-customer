package com.simtlix.consultafijapoc.customer.service;

import com.simtlix.consultafijapoc.customer.model.InstallationAddress;
import com.simtlix.consultafijapoc.customer.repository.InstallationAddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstallationAddressService {

    @Autowired
    InstallationAddressRepository installationAddressRepository;

    public List<InstallationAddress> findInstallationAddressesByAccountId(Integer accountId) {
        return installationAddressRepository.findInstallationAddressesByAccountId(accountId);
    }
}
