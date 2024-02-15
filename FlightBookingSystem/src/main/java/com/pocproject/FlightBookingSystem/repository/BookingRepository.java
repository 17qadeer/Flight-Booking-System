package com.pocproject.FlightBookingSystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.pocproject.FlightBookingSystem.model.Booking;

@Repository
public interface BookingRepository  extends JpaRepository<Booking, Long>{

	@Query("from Booking b where b.userId=:userId")
	List<Booking> findAllByUserId(@Param ("userId") Long userId);

	
}
