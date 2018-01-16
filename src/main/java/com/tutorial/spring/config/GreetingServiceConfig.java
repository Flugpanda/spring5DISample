package com.tutorial.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import com.tutorial.spring.repositories.IGreetingRepository;
import com.tutorial.spring.services.GreetingServiceFactory;
import com.tutorial.spring.services.IGreetingService;
import com.tutorial.spring.utils.SupportedLanguages;

/**
 * Java based spring configuration to declare some beans for the factory bean example
 * 
 * @author Bastian Bräunel
 *
 */
@Configuration
public class GreetingServiceConfig {
	
	@Bean
	GreetingServiceFactory greetingServiceFactory(IGreetingRepository greetingRepository) {
		return new GreetingServiceFactory(greetingRepository); 
	}
	
	@Bean
	@Primary
	@Profile({"en","default"})
	IGreetingService primaryGreetingService(GreetingServiceFactory greetingServiceFactory) {
		return greetingServiceFactory.createGreetingSevice(SupportedLanguages.EN);
	}
	
	@Bean
	@Primary
	@Profile("de")
	IGreetingService primaryGermanGreetingService(GreetingServiceFactory greetingServiceFactory) {
		return greetingServiceFactory.createGreetingSevice(SupportedLanguages.DE);
	}
}
