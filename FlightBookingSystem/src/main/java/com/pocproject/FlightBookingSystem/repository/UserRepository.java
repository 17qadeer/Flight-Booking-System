package com.pocproject.FlightBookingSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pocproject.FlightBookingSystem.model.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
	public User findByUserEmail(String email);
}
