package com.pocproject.FlightBookingSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.pocproject.FlightBookingSystem.service.AdminService;

@RestController
@CrossOrigin("*")
public class AdminLoginController {

	@Autowired
	private AdminService adminService;
}
