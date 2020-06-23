package com.adactin.stepdefinition;

import java.io.IOException;

import com.cucumber.baseclass.Baseclass;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Baseclass{

	
	
	@Before
	public void beforeHooks( Scenario scenario)
	
	{
		System.out.println(scenario.getName());
	}
	
	@After
	public void afterHooks( Scenario scenario) throws IOException
			
	{
		System.out.println(scenario.getStatus());
		{
			if(scenario.isFailed())
			{
				
		takeScreenShot(scenario.getId());
	}
}
	}
}
