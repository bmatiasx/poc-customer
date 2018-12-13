package com.simtlix.consultafijapoc.customer.service;

import com.simtlix.consultafijapoc.customer.model.Subscription;
import com.simtlix.consultafijapoc.customer.repository.SubscriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubscribedServiceService {
    @Autowired
    private SubscriptionRepository subscriptionRepository;

    public List<Subscription> findSubscribedServicesByAccountId(Integer accountId) {

        return subscriptionRepository.findSubscribedServicesByAccountId(accountId);
    }
}
