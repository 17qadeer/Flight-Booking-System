//package com.pocproject.FlightBookingSystem.security;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.web.AuthenticationEntryPoint;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;
//
//import lombok.RequiredArgsConstructor;
//
//@RequiredArgsConstructor
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig{
//	
//	
//
//	@Bean
//	SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
//		
//		final UserAuthenticationEntryPoint userAuthenticationEntryPoint;
//		http
//			.exceptionHandling().authenticationEntryPoint(null)
//			.and()
//			.addFilterBefore(new JwtAuthFilter(), BasicAuthenticationFilter.class)
//			.csrf().disable()
//			.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
//			.and()
//			.authorizeHttpRequests((requests) -> requests
//					.requestMatchers(HttpMethod.POST, "/login", "/register").permitAll()
//					.anyRequest().authenticated());
//		
//		return http.build();
//	}
//	
//}
