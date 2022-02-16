package com.example.accountservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {


    private int accountId;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String accountName;
    private String accountCreationDate;
}
