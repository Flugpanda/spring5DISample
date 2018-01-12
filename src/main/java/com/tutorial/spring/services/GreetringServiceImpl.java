package com.tutorial.spring.services;

import org.springframework.stereotype.Service;

/**
 * The concrete class implementation for the interface IGreetingService
 * 
 * @author Bastian Bräunel
 *
 */
@Service
public class GreetringServiceImpl implements IGreetingService {

	public static final String HELLO_SERVICE = "Hello from the injected Service.";
	
	@Override
	public String sayGreeting() {
		
		return HELLO_SERVICE;
	}

}
