package com.payment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.payment.model.Transactions;


public interface TransactionRepository extends JpaRepository<Transactions, Long> {

}
