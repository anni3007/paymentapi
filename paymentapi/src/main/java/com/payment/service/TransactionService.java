package com.payment.service;

import java.util.List;

import com.payment.model.Transactions;

public interface TransactionService {

	public List<Transactions> getAllTransactions();
}
