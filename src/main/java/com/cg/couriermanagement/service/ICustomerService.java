package com.cg.couriermanagement.service;

import java.util.List;

import com.cg.couriermanagement.model.Customer;


public interface ICustomerService {

               public Customer addCustomer(Customer customer);
               public Customer getCustomerById(int customerId);
               public List<Customer> getAllCustomerInfo();
}
