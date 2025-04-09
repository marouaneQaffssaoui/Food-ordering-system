package com.food.ordering.system.order.service.domain.ports.output.repository;

import com.food.ordering.system.order.service.domain.entity.Custmer;

import java.util.Optional;
import java.util.UUID;

public interface CustomerRepository {
    Optional<Custmer> findCustomer(UUID customerId);
}
