package com.pocproject.FlightBookingSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pocproject.FlightBookingSystem.model.Booking;
import com.pocproject.FlightBookingSystem.service.BookingService;

@RestController
@CrossOrigin("*")
public class BookingController {

	@Autowired
	private BookingService bookingService;
	
	@PostMapping("/flights/book-flight")
	public String addNewBooking(@RequestBody List<Booking> bookings) {
		
		for(Booking booking : bookings) {
			bookingService.book(booking);
		}
		
		return "Success";
		
	}
	
//	@GetMapping("/flights/bookings")
//	public List<Booking> getAllBookingsByUserId(@RequestParam Long userId){
//		List<Booking> bookingsList = bookingService.getAllBookingsByUserId(userId);
//		
//		for(Booking booking : bookingsList) {
//			
//		}
//	}
}
