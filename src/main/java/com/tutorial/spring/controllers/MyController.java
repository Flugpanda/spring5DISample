package com.tutorial.spring.controllers;

import org.springframework.stereotype.Controller;

/**
 * Just a simple controller that will be grabbed from the context in the main application.
 * 
 * @author Bastian Bräunel
 *
 */
@Controller
public class MyController {
	
	public void sayHallo() {
		System.out.println("Hallo World");
	}
}
