package com.example.bank_api.model;


import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
public class Transaction {

    @Id
    private String transactionId;

    @Enumerated(EnumType.STRING)
    private TransactionType transactionType;


    @Enumerated(EnumType.STRING)
    private NetworkProvider networkProvider;

    private String phoneNumber;
    private BigDecimal originalAmount;
    private BigDecimal discountAmount;
    private BigDecimal amountCharged;

    @ManyToOne
    @JoinColumn(name="source_account_number", nullable=false)
    private Account sourceAccount;

    @ManyToOne
    @JoinColumn(name="destination_account")
    private Account destinationAccount;




}
