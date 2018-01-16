package com.tutorial.spring.services;

import com.tutorial.spring.repositories.IGreetingRepository;

/**
 * This class shown a basic implementation how to use factory bean
 * 
 * @author Bastian Bräunel
 *
 */
public class GreetingServiceFactory {

	private IGreetingRepository greetingRepository;

	/**
	 * default constructor for the factory
	 * 
	 * @param greetingRepository	injected by spring framework
	 */
	public GreetingServiceFactory(IGreetingRepository greetingRepository) {
		this.greetingRepository = greetingRepository;
	}

	/**
	 * 
	 * @param lang
	 * @return
	 */
    public IGreetingService createGreetingSevice(String lang) {

        switch (lang){
            case "en":
                return new PrimaryGreetingService(greetingRepository);
            case "de":
                return new PrimaryGermanGreetingService(greetingRepository);
            default:
                return new PrimaryGreetingService(greetingRepository);
        }
    }
}
