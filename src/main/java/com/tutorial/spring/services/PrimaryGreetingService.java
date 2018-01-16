package com.tutorial.spring.services;

import com.tutorial.spring.repositories.IGreetingRepository;

/**
 * Another implementation of the IGreetingService
 * This class is used to try out primary
 * 
 * @author Bastian Bräunel
 *
 */
public class PrimaryGreetingService implements IGreetingService {

	private IGreetingRepository primaryGreetingRepository;
	
	public PrimaryGreetingService(IGreetingRepository primaryGreetingRepository) {
		this.primaryGreetingRepository = primaryGreetingRepository;
	}

	@Override
	public String sayGreeting() {
		return primaryGreetingRepository.getEnglishGreeting();
	}

}
