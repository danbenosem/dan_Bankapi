package com.example.bank_api.repository;

import com.example.bank_api.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository <Transaction,String> {
}
