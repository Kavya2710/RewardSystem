package com.customer.controller;

import com.customer.reward.entity.Customer;
import  com.customer.reward.entity.Transaction;
import com.customer.repository.customerRepository;
import com.customer.repository.transactionRepository;
import com.customer.rewardService.Services;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rewards")
public class Controller {

    private final Services service;

    public Controller(Services service) {
        this.service = service;
    }

    @PostMapping("/customers")
    public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer) {
        try {
			try {
				return ResponseEntity.ok(Services.createCustomer(customer));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
    }

    @GetMapping("/customers")
    public ResponseEntity<Object> getAllCustomers() {
        return ResponseEntity.ok(service.getAllCustomers());
    }

    @PostMapping("/customers/{customerId}/transactions")
    public ResponseEntity<Object> createTransaction(
            @PathVariable Long customerId,
            @RequestParam Double amount) {
        return ResponseEntity.ok(service.createTransaction(customerId, amount));
    }
}