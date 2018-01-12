package com.tutorial.spring.controllers;

import com.tutorial.spring.services.GreetringServiceImpl;

/**
 * This class shows how property based dependency injection works.
 *
 * NOTE:
 * Not a very good way to do dependency injection!
 * 
 * @author Bastian Bräunel
 *
 */
public class PropertyInjectedController {

	// public property using the concrete class instead of the interface
	// the property has to be public, otherwise di won't work
	public GreetringServiceImpl greetingSerice;
	
	public String sayHallo() {
		return greetingSerice.sayGreeting();
	}
}
