package com.tutorial.spring.controllers;

import com.tutorial.spring.services.IGreetingService;

/**
 * This class shows how setter based dependency injection works.
 * 
 * @author Bastian Bräunel
 *
 */
public class SetterInjectedController {
	
	// private property of the interface type
	private IGreetingService greetingService;
	
	public String sayHello() { 
		return greetingService.sayGreeting();
	}

	/**
	 * This method handles the dependency injection
	 */
	public void setGreetingService(IGreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	
}
