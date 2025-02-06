package com.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.model.UserDetails;
import com.user.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails createUser(UserDetails user) {
		
		return userRepository.save(user);
	}
	
	@Override
	public boolean checkEmail(String email) {
		
		return userRepository.existsByEmail(email);
	}
	
	

}
