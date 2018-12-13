package com.simtlix.consultafijapoc.customer.service;

import com.simtlix.consultafijapoc.customer.model.Address;
import com.simtlix.consultafijapoc.customer.model.Subscription;
import com.simtlix.consultafijapoc.customer.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Service
public class InstallationAddressService {

    @Autowired
    AddressRepository addressRepository;

    @Autowired
    private SubscribedServiceService subscribedServiceService;

    public List<Address> findInstallationAddressesByAccountId(Integer accountId) {
        List<Subscription> subscriptions;
        Set<Address> addresses = addressRepository.findInstallationAddressesByAccountId(accountId);
        /* Remove duplicate Addresses*/
        List<Address> customerAdresses = new ArrayList<>();

        for (Address address : addresses) {
            Address customerAddress = new Address();
            subscriptions = subscribedServiceService.findSubscribedServicesByAccountId(address.getAccountId());

            customerAddress.setAccountId(address.getAccountId());
            customerAddress.setStreet(address.getStreet());
            customerAddress.setNumber(address.getNumber());
            customerAddress.setTower(address.getTower());
            customerAddress.setFloor(address.getFloor());
            customerAddress.setFlat(address.getFlat());
            customerAddress.setWithinStreets(address.getWithinStreets());
            customerAddress.setCity(address.getWithinStreets());
            customerAddress.setDepartment(address.getDepartment());
            customerAddress.setSubscriptions(subscriptions);
            customerAdresses.add(customerAddress);
        }

        return customerAdresses;
    }
}
