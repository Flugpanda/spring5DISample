package com.tutorial.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.tutorial.spring.services.IGreetingService;

/**
 * This class shows how property based dependency injection works.
 *
 * NOTE:
 * Not a very good way to do dependency injection!
 * 
 * @author Bastian Bräunel
 *
 */
@Controller
public class PropertyInjectedController {

	/**
	 * public property using the concrete class instead of the interface
	 * the property has to be public, otherwise di won't work
	 * 
	 * @Qualifier
	 * This annotation is not used in this example. So the is a little trick needed.
	 * The variable (property name) is exactly named after the bean (GreetringServiceImpl) that shall be injected
	 * Spring will notice that via reflection an will inject the correct bean
	 */
	@Autowired
	public IGreetingService greetringServiceImpl;
	
	public String sayHello() {
		return greetringServiceImpl.sayGreeting();
	}
}
