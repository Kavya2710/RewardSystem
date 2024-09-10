package com.customer.repository;


import  com.customer.reward.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface transactionRepository extends JpaRepository<Transaction, Long> {
}