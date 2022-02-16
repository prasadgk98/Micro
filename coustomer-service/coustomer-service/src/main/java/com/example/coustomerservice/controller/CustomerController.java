package com.example.coustomerservice.controller;

import com.example.coustomerservice.entity.Coustomer;
import com.example.coustomerservice.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
@Slf4j
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping
    public Coustomer saveCustomer(Coustomer coustomer) {
        log.info("Inside saveCustomer of CustomerController");
        return customerService.saveCustomer(coustomer);
    }
}
