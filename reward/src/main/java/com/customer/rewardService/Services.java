package com.customer.rewardService;

import com.customer.reward.entity.Customer;
import  com.customer.reward.entity.Transaction;
import com.customer.repository.customerRepository;
import com.customer.repository.transactionRepository;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class Services {

    private static customerRepository customerRepository;
    private final transactionRepository transactionRepository;

    public Services(customerRepository customerrepository, transactionRepository transactionrepository) {
        this.customerRepository = customerrepository;
        this.transactionRepository = transactionrepository;
    }

    public static Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

	public Object getAllCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object createTransaction(Long customerId, Double amount) {
		// TODO Auto-generated method stub
		return null;
	}
}
