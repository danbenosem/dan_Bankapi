package com.example.bank_api.model;


import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customer_id;

    private LocalDate customerDuration;

    @OneToMany(mappedBy="customer")
    private List<Account> accounts= new ArrayList<>();

}
