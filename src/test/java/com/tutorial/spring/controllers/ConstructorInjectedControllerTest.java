package com.tutorial.spring.controllers;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.tutorial.spring.services.GreetringServiceImpl;

import ch.qos.logback.core.pattern.color.GreenCompositeConverter;

public class ConstructorInjectedControllerTest {

	private ConstructorInjectedController constructorInjectedController;
	
	@Before
	public void setUp() throws Exception {
		constructorInjectedController = new ConstructorInjectedController(new GreetringServiceImpl());
	}

	@Test
	public void testGreeting() {
		assertEquals(GreetringServiceImpl.HELLO_SERVICE, constructorInjectedController.sayHello());
	}

}
