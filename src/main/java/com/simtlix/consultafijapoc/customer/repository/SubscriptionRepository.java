package com.simtlix.consultafijapoc.customer.repository;

import com.simtlix.consultafijapoc.customer.model.Subscription;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Set;

public interface SubscriptionRepository extends JpaRepository<Subscription, Long> {

    List<Subscription> findAllByAccountId(Long accountId);
}
