package com.tutorial.spring.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * This class is another implementation of the IGreetingService
 * using a profile
 * 
 * @author Bastian Bräunel
 *
 */
@Service
@Profile("de")
@Primary
public class PrimaryGermanGreetingService implements IGreetingService {

	@Override
	public String sayGreeting() {
		return "Hallo von dem injecteden PrimaryGreetingService!";
	}

}
