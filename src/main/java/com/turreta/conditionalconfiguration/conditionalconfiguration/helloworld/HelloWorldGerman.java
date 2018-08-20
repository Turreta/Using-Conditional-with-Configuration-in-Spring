package com.turreta.conditionalconfiguration.conditionalconfiguration.helloworld;

import com.turreta.conditionalconfiguration.conditionalconfiguration.HelloWorld;

public class HelloWorldGerman implements HelloWorld
{
	@Override public String getGreeting()
	{
		return "Hallo Welt!";
	}
}
