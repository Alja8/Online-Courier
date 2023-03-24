package com.cg.couriermanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.couriermanagement.model.Customer;
import com.cg.couriermanagement.service.ICustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
@Autowired
private ICustomerService customerService;

 @PostMapping("/add")
               public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer) {
               Customer newCustomer = customerService.addCustomer(customer);
                              ResponseEntity<Customer> responseEntity = new ResponseEntity<>(newCustomer,HttpStatus.CREATED);
                              return responseEntity;                   
               }
               
               @GetMapping("/{customerId}")
               public  ResponseEntity<Customer> getCustomerById(@PathVariable("customerId") int customerId) {
                              Customer customer = customerService.getCustomerById(customerId);
                              ResponseEntity<Customer> responseEntity = new ResponseEntity<>(customer,HttpStatus.OK);
                              return responseEntity;
               }
               
               @GetMapping("/all")
               public List<Customer> getAllCustomerInfo() {
                              List<Customer> customers = customerService.getAllCustomerInfo();
                              return customers;
               }
}
