package com.user.service;

import com.user.model.UserDetails;

public interface UserService {
	
	public UserDetails createUser(UserDetails user);
	
	public boolean checkEmail(String email);

}
