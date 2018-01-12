package com.tutorial.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.tutorial.spring.services.IGreetingService;

/**
 * This class shows how setter based dependency injection works.
 * 
 * @author Bastian Bräunel
 *
 */
@Controller
public class SetterInjectedController {
	
	// private property of the interface type
	private IGreetingService greetingService;
	
	public String sayHello() { 
		return greetingService.sayGreeting();
	}

	/**
	 * This method handles the dependency injection
	 * 
	 * @Autowired	this tells spring to use this method for dependency injection
	 * @Qualifier("setterGreetingService")		this tells spring to prioritize the SetterGreetingService, instead of the other classes that implement IGreetingService
	 */
	@Autowired
	@Qualifier("setterGreetingService")
	public void setGreetingService(IGreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	
}
