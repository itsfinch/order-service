package com.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.user.model.UserDetails;

@Repository
public interface UserRepository extends JpaRepository<UserDetails, Integer>{
	
	public boolean existsByEmail(String email);

}
