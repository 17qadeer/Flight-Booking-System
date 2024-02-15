//package com.pocproject.FlightBookingSystem.security;
//
//import java.util.Base64;
//import java.util.Date;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.autoconfigure.security.oauth2.resource.OAuth2ResourceServerProperties.Jwt;
//import org.springframework.stereotype.Component;
//
//import jakarta.annotation.PostConstruct;
//import lombok.RequiredArgsConstructor;
//
//
//@RequiredArgsConstructor
//@Component
//public class UserAuthProvider {
//
//	@Value("${security.jwt.token.secret-key:secret-value}")
//	private String secretKey;
//	
//	@PostConstruct
//	protected void init() {
//		secretKey = Base64.getEncoder().encodeToString(secretKey.getBytes());
//	}
//	
//	public String createToken(String login) {
//		Date now = new Date();
//		Date validity = new Date(now.getTime() + 3_600_000);
//		
//		return JWT
//	}
//	
//	
//}
