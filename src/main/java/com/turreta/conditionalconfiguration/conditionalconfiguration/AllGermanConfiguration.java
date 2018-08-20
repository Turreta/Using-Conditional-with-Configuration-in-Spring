package com.turreta.conditionalconfiguration.conditionalconfiguration;

import com.turreta.conditionalconfiguration.conditionalconfiguration.condition.GermanLanguageCondition;
import com.turreta.conditionalconfiguration.conditionalconfiguration.credits.CreditsGerman;
import com.turreta.conditionalconfiguration.conditionalconfiguration.helloworld.HelloWorldGerman;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
@Conditional(GermanLanguageCondition.class)
public class AllGermanConfiguration
{
	@Bean
	public CreditsGerman creditsGerman()
	{
		return new CreditsGerman();
	}

	@Bean
	public HelloWorldGerman helloWorldGerman()
	{
		return new HelloWorldGerman();
	}
}
