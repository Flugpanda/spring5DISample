package com.tutorial.spring.controllers;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.tutorial.spring.services.GreetringServiceImpl;

public class PropertyInjectedControllerTest {

	private PropertyInjectedController propertyInjectedController;
	
	@Before
	public void setUp() throws Exception {
		propertyInjectedController = new PropertyInjectedController();
		propertyInjectedController.greetringServiceImpl = new GreetringServiceImpl();
	}

	@Test
	public void testGreeting() {
		assertEquals(GreetringServiceImpl.HELLO_SERVICE, propertyInjectedController.sayHello());
	}

}
