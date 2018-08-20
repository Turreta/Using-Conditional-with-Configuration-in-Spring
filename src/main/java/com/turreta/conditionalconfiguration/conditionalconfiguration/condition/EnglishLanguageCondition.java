package com.turreta.conditionalconfiguration.conditionalconfiguration.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class EnglishLanguageCondition implements Condition
{
	@Override public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata)
	{
		// Don't check for actual value
		String lang = conditionContext.getEnvironment().getProperty("english");
		return lang != null;
	}
}
