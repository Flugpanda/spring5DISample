package com.tutorial.spring.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * Another implementation of the IGreetingService
 * This class is used to try out primary
 * 
 * @author Bastian Bräunel
 *
 * @Primary		if there is more then one bean, use this one
 */
@Service
@Primary
public class PrimaryGreetingService implements IGreetingService {

	@Override
	public String sayGreeting() {
		return "Hello from the injected PrimaryGreetingService!";
	}

}
