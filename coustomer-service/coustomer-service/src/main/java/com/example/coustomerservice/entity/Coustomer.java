package com.example.coustomerservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Coustomer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Integer customerId;
    private String firstName;
    private String email;
    private String accountId;
}
