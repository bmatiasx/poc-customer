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
public class AddressService {

    @Autowired
    AddressRepository addressRepository;

    @Autowired
    private SubscriptionService subscriptionService;

    public List<Address> findInstallationAddressesByAccountId(Integer accountId) {
        Set<Subscription> subscriptions;
        Set<Address> addresses = addressRepository.findInstallationAddressesByAccountId(accountId);

        List<Address> customerAdresses = new ArrayList<>();

        for (Address address : addresses) {
            subscriptions = subscriptionService.findSubscribedServicesByAccountId(address.getAccountId());
            customerAdresses.add(setCustomerAddress(address, subscriptions));
        }

        return customerAdresses;
    }

    private Address setCustomerAddress(Address address, Set<Subscription> subscriptions) {
        Address customerAddress = new Address();
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

        return customerAddress;
    }
}
