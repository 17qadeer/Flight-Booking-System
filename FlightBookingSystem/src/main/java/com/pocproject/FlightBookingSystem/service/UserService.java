package com.pocproject.FlightBookingSystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.pocproject.FlightBookingSystem.model.User;
import com.pocproject.FlightBookingSystem.repository.UserRepository;

import jakarta.servlet.http.HttpSession;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	
	@Autowired
	HttpSession httpSession;
	
	
	public User getByEmail(String email) {
		return userRepository.findByUserEmail(email);
	}
	
	
	public ResponseEntity<?> loginCheck(User user){
		if(getByEmail(user.getUserEmail())!=null) {
			User user1=getByEmail(user.getUserEmail());
			if(user1.getPassword().equals(user.getPassword())) {
				httpSession.setAttribute("user", user1);
				return ResponseEntity.ok(user1);
			}
			else {
				return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid Credentials! Please enter valid credentials");
			}
			
		}
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not found");
	}
	
	
	public String registerUser(User user){
		if(getByEmail(user.getUserEmail())==null) {
			userRepository.save(user);
			return "registration successful";
			
		}
		return "cannot register";
	}
	
	public ResponseEntity<String> logout(){
		httpSession.removeAttribute("user");
		return new ResponseEntity<>("logout successfully", HttpStatus.OK);
	}

}
