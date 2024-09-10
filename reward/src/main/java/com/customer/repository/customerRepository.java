package com.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.customer.reward.entity.Customer;

@Repository
public interface customerRepository extends JpaRepository<Customer, Long> {
}
