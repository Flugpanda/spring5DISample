package com.tutorial.spring.repositories;

import org.springframework.stereotype.Component;

/**
 * Implementation of the IGreetingRepository
 * 
 * @author Bastian Bräunel
 *
 */
@Component
public class GreetingRepository implements IGreetingRepository {

    @Override
    public String getEnglishGreeting() {
        return "Hello - From the primary greeting service";
    }

    @Override
    public String getGermanGreeting() {
        return "Hallo - Von dem deutschen Begrüßungsdienst!";
    }

}
