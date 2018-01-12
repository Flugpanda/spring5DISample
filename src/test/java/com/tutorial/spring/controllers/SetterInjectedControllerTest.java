package com.tutorial.spring.controllers;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.tutorial.spring.services.GreetringServiceImpl;

public class SetterInjectedControllerTest {

	private SetterInjectedController setterInjectedController;
	
	@Before
	public void setUp() throws Exception {
		setterInjectedController = new SetterInjectedController();
		setterInjectedController.setGreetingService(new GreetringServiceImpl());
	}

	@Test
	public void tesGreeting() {
		assertEquals(GreetringServiceImpl.HELLO_SERVICE, setterInjectedController.sayHello());
	}

}
