package com.payment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.payment.model.Transactions;
import com.payment.repository.TransactionRepository;
@Service
public class TransactionServiceImpl implements TransactionService {

	@Autowired
	TransactionRepository trRepo;
	
	@Override
	public List<Transactions> getAllTransactions() {
		List<Transactions> trList=trRepo.findAll();
		return trList;
	}

}
