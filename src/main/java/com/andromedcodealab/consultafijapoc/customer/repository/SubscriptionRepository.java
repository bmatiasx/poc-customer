package com.andromedcodealab.consultafijapoc.customer.repository;

import com.andromedcodealab.consultafijapoc.customer.model.Subscription;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SubscriptionRepository extends JpaRepository<Subscription, Long> {

    List<Subscription> findAllByAccountId(Long accountId);
}
