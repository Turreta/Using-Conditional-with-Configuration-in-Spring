package com.turreta.conditionalconfiguration.conditionalconfiguration;

import com.turreta.conditionalconfiguration.conditionalconfiguration.condition.EnglishLanguageCondition;
import com.turreta.conditionalconfiguration.conditionalconfiguration.credits.CreditsEnglish;
import com.turreta.conditionalconfiguration.conditionalconfiguration.helloworld.HelloWorldEnglish;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
@Conditional(EnglishLanguageCondition.class)
public class AllEnglishConfiguration
{
	@Bean
	public CreditsEnglish creditsEnglish()
	{
		return new CreditsEnglish();
	}

	@Bean
	public HelloWorldEnglish helloWorldEnglish()
	{
		return new HelloWorldEnglish();
	}
}
