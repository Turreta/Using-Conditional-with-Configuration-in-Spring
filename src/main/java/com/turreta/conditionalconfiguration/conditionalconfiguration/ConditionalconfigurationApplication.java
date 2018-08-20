package com.turreta.conditionalconfiguration.conditionalconfiguration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ConditionalconfigurationApplication
{
	public static void main(String[] args)
	{
		//System.setProperty("german", "any value");
		System.setProperty("english", "any value");

		final ConfigurableApplicationContext context = SpringApplication
				.run(ConditionalconfigurationApplication.class, args);

		System.out.println(context.getBean(HelloWorld.class).getGreeting());
		System.out.println(context.getBean(Credits.class).getCredits());
	}
}
