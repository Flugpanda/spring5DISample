package com.tutorial.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
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
	 */
	@Autowired
	public void setGreetingService(IGreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	
}
