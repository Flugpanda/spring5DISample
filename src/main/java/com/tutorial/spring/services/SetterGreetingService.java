package com.tutorial.spring.services;

import org.springframework.stereotype.Service;

/**
 * Another implementation of the IGreetingService
 * This class is used to try out qualifiers
 * 
 * @author Bastian Bräunel
 *
 */
@Service
public class SetterGreetingService implements IGreetingService {

	@Override
	public String sayGreeting() {
		return "Hello from the injected SetterGreetingService!";
	}

}
