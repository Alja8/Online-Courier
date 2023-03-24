package com.cg.couriermanagement.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.couriermanagement.entity.CustomerEntity;
import com.cg.couriermanagement.exception.CustomerNotFoundException;
import com.cg.couriermanagement.model.Customer;
import com.cg.couriermanagement.repository.ICustomerRepo;

@Service
public class ICustomerServiceImpl implements ICustomerService {

               @Autowired
               private ICustomerRepo customerRepo;
               @Override
               public Customer addCustomer(Customer customer) {
                              // convert customer model to customer entity
                              CustomerEntity customerEntity = new CustomerEntity();
                              BeanUtils.copyProperties(customer, customerEntity);

                              CustomerEntity newCustomerEntity = customerRepo.save(customerEntity);

                              // convert product entity to product model
                              Customer newCustomer = new Customer();
                              BeanUtils.copyProperties(newCustomerEntity, newCustomer);

                              return newCustomer;
               }

               @Override
               public Customer getCustomerById(int customerId) {
                              Optional<CustomerEntity> optionalCustomer = customerRepo.findById(customerId);
                              if (optionalCustomer.isEmpty()) {
                                             throw new CustomerNotFoundException("Customer not existing with id: " + customerId);
                              }
                              CustomerEntity customerEntity = optionalCustomer.get();

                              // convert product entity to product model
                              Customer customer = new Customer();
                              BeanUtils.copyProperties(customerEntity, customer);

                              return customer;
               }

               @Override
               public List<Customer> getAllCustomerInfo() {
        List<CustomerEntity> customerEntities = customerRepo.findAll();
                              
                              //convert product entity list to product list
                              List<Customer> customers = new ArrayList<>();
                              
                              customerEntities.forEach(pentity-> {
                                             Customer customer = new Customer();
                                             BeanUtils.copyProperties(pentity, customer);
                                             customers.add(customer);
                              });                          
                              
                              return customers;
               }

}
