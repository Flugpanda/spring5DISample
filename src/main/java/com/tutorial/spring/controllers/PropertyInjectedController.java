package com.tutorial.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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
	 * @Qualifier	specify the service, otherwise the  @Primary bean will be injected
	 */
	@Autowired
	@Qualifier("greetringServiceImpl")
	public IGreetingService greetringServiceImpl;
	
	public String sayHello() {
		return greetringServiceImpl.sayGreeting();
	}
}
