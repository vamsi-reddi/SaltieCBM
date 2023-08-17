package com.saltie.CBM.service;

import com.saltie.CBM.model.Customer;

import java.util.List;

public interface CustomerService {

    Customer viewCustomer(Long id);

    List<Customer> viewCustomers();

    Customer addCustomer(Customer customer);

    Customer updateCustomer(Customer customer);

    String removeCustomer(Long id);
}
