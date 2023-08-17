package com.saltie.CBM.controller;

import com.saltie.CBM.model.Customer;
import com.saltie.CBM.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping("/viewById/{id}")
    public Customer viewCustomer(@PathVariable("id") Long id) {
        return customerService.viewCustomer(id);
    }

    @GetMapping("/view")
    public List<Customer> viewCustomers() {
        return customerService.viewCustomers();
    }

    @PostMapping("/create")
    public Customer addCustomer(@RequestBody Customer customer) {
        return customerService.addCustomer(customer);
    }

    @PutMapping("/update")
    public Customer updateCustomer(@RequestBody Customer customer) {
        return customerService.updateCustomer(customer);
    }

    @DeleteMapping("/delete/{id}")
    public  String removeCustomer(@PathVariable("id") Long id) {
        return  customerService.removeCustomer(id);
    }
}
