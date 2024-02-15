package com.pocproject.FlightBookingSystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="bookings")
public class Booking {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long bookingId;
	
	private Long userId;
	private Long flightId;
	private Long cabinId;
	private String firstName;
	private String lastName;
	private int age;
	private String email;
	private String mobileNumber;
	private String gender;
	private boolean isPaymentDone;
	
	public Booking() {
		super();
	}

	public Booking(Long bookingId, Long userId, Long flightId, Long cabinId, String firstName, String lastName, int age,
			String email, String mobileNumber, String gender, boolean isPaymentDone) {
		super();
		this.bookingId = bookingId;
		this.userId = userId;
		this.flightId = flightId;
		this.cabinId = cabinId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.gender = gender;
		this.isPaymentDone = isPaymentDone;
	}

	public Long getBookingId() {
		return bookingId;
	}

	public void setBookingId(Long bookingId) {
		this.bookingId = bookingId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getFlightId() {
		return flightId;
	}

	public void setFlightId(Long flightId) {
		this.flightId = flightId;
	}

	public Long getCabinId() {
		return cabinId;
	}

	public void setCabinId(Long cabinId) {
		this.cabinId = cabinId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public boolean isPaymentDone() {
		return isPaymentDone;
	}

	public void setPaymentDone(boolean isPaymentDone) {
		this.isPaymentDone = isPaymentDone;
	}

	@Override
	public String toString() {
		return "Booking [BookingId=" + bookingId + ", userId=" + userId + ", flightId=" + flightId + ", cabinId="
				+ cabinId + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", email=" + email
				+ ", mobileNumber=" + mobileNumber + ", gender=" + gender + ", isPaymentDone=" + isPaymentDone + "]";
	}
	
	
	
}
