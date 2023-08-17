package com.saltie.CBM.service;

import com.saltie.CBM.model.Customer;
import com.saltie.CBM.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;
    @Override
    public Customer viewCustomer(Long id) {
        return customerRepository.findById(id).get();
    }

    @Override
    public List<Customer> viewCustomers() {
        return  customerRepository.findAll();
    }

    @Override
    public Customer addCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Customer updateCustomer(Customer customer) {
        if(customerRepository.findById(customer.getId()).isPresent()){
            Customer temp = customerRepository.findById(customer.getId()).get();
            temp.setAge(customer.getAge());
            temp.setEmail(customer.getEmail());
            temp.setName(customer.getName());
            return customerRepository.save(temp);
        }
        return null;
    }

    @Override
    public String removeCustomer(Long id) {
        customerRepository.deleteById(id);
        return "removed successfully";
    }
}
