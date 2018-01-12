package com.tutorial.spring.controllers;

import org.springframework.stereotype.Controller;

import com.tutorial.spring.services.IGreetingService;

/**
 * Just a simple controller that will be grabbed from the context in the main application.
 * 
 * @author Bastian Bräunel
 *
 */
@Controller
public class MyController {
	
	private IGreetingService greetingService;
	
	public MyController(IGreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String sayHallo() {
		System.out.println("Hallo World");
		
		return greetingService.sayGreeting();
	}
}
