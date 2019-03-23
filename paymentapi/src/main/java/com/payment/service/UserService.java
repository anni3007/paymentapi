package com.payment.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.payment.exception.ResourceNotFoundException;
import com.payment.model.AddMoney;
import com.payment.model.User;


public interface UserService {

	public List<User> getAllUsers();
	public User getSelfUser() throws ResourceNotFoundException;
	public User addUser(User user);
	public String addMoney(AddMoney addMoney) throws NumberFormatException, ResourceNotFoundException;
}
