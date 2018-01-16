package com.tutorial.spring.services;

import com.tutorial.spring.repositories.IGreetingRepository;

/**
 * This class is another implementation of the IGreetingService
 * using a profile
 * 
 * @author Bastian Bräunel
 *
 */
public class PrimaryGermanGreetingService implements IGreetingService {

	private IGreetingRepository greetingRepository;
	
	public PrimaryGermanGreetingService(IGreetingRepository greetingRepository) {
		this.greetingRepository = greetingRepository;
	}

	@Override
	public String sayGreeting() {
		return greetingRepository.getGermanGreeting();
	}

}
