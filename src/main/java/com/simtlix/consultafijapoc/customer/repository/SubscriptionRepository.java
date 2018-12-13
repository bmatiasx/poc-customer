package com.simtlix.consultafijapoc.customer.repository;

import com.simtlix.consultafijapoc.customer.model.Subscription;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SubscribedServiceRepository extends JpaRepository<Subscription, Integer> {
    List<Subscription> findSubscribedServicesByAccountId(Integer accountId);
}
