package com.example.bank_api.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Account {
    @Id
    private String accountNumber;

    private BigDecimal balance;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @OneToMany(mappedBy="sourceAccount ")
    private List<Transaction> sentTransactions= new ArrayList<>();

    @OneToMany(mappedBy="destinationAccount")
    private List<Transaction> receivedTransactions= new ArrayList<>();
}