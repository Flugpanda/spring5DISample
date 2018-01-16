package com.tutorial.spring.services;

import com.tutorial.spring.repositories.IGreetingRepository;
import com.tutorial.spring.utils.SupportedLanguages;

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
    public IGreetingService createGreetingSevice(SupportedLanguages lang) {

        switch (lang){
            case EN:
                return new PrimaryGreetingService(greetingRepository);
            case DE:
                return new PrimaryGermanGreetingService(greetingRepository);
            default:
                return new PrimaryGreetingService(greetingRepository);
        }
    }
}
