package com.example.coustomerservice.service;


import com.example.coustomerservice.entity.Coustomer;
import com.example.coustomerservice.repository.CustomerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Coustomer saveCustomer(Coustomer coustomer) {
        log.info("Inside saveCustomer of CustomerService");

        return customerRepository.save(coustomer);
    }
}
