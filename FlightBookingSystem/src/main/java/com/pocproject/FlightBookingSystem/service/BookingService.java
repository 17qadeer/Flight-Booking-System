package com.pocproject.FlightBookingSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pocproject.FlightBookingSystem.model.Booking;
import com.pocproject.FlightBookingSystem.repository.BookingRepository;

@Service
public class BookingService {

	@Autowired
	private BookingRepository bookingRepository;
	
	public Booking book(Booking booking) {
		return bookingRepository.save(booking);
	}
	
	public List<Booking> getAllBookingsByUserId(Long userId) {
		return bookingRepository.findAllByUserId(userId);
	}
}
