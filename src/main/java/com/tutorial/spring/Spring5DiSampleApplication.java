package com.tutorial.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.tutorial.spring.controllers.MyController;

@SpringBootApplication
public class Spring5DiSampleApplication {

	public static void main(String[] args) {
		
		ApplicationContext context = SpringApplication.run(Spring5DiSampleApplication.class, args);
		
		// getting an instance of a MyController-Bean from the spring context
		MyController controller = (MyController) context.getBean(MyController.class);

		controller.sayHallo();
	}
}
