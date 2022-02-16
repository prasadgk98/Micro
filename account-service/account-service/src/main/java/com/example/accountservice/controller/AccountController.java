package com.example.accountservice.controller;

import com.example.accountservice.entity.Account;
import com.example.accountservice.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/account")
public class AccountController {


    @Autowired
    private AccountService accountService;

    @PostMapping ("/add")
    public ResponseEntity <Account> addAccount(@RequestBody Account account){
        Account account1=  accountService.addAccount(account);
        return new ResponseEntity<Account>(account1, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Account> getById(@PathVariable("id") IntegerId){
        Account one= accountServ.findById(id);
        return new ResponseEntity<Account>(one,HttpStatus.OK);
    }
}


