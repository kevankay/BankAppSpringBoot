package com.capgemini.bankapp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.bankapp.entities.Customer;
import com.capgemini.bankapp.exception.PayeeAccountNotFoundException;
import com.capgemini.bankapp.repository.CustomerRepository;
import com.capgemini.bankapp.repository.impl.CustomerRepositoryImpl;
import com.capgemini.bankapp.service.CustomerService;
@Service
public class CustomerServiceImpl implements CustomerService{
	@Autowired	
	private CustomerRepository customerRepository;
		
	

		@Override
		public Customer authenticate(Customer customer) throws PayeeAccountNotFoundException {
			
			return customerRepository.authenticate(customer);
		}

		@Override
		public Customer updateProfile(Customer customer) {
			
			return customerRepository.updateProfile(customer);
		}

		@Override
		public boolean updatePassword(Customer customer, String oldPassword, String newPassword) {
			return customerRepository.updatePassword(customer, oldPassword, newPassword);
		}

	}

