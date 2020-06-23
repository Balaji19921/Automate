package com.adactin.runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.utility.ConfigurationReader;
import com.cucumber.baseclass.Baseclass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\adactin\\feature", glue = "com\\adactin\\stepdefinition", monochrome = true, dryRun = false, strict = true, plugin = {
		"pretty", "html:Report\\CucumberReport",
		"com.cucumber.listener.ExtentCucumberFormatter:Report\\extentReport.html" })
//tags= {"@login}
public class Runner extends Baseclass {

	public static WebDriver driver;

	@BeforeClass
	public static void browserOpen() throws Exception {
		ConfigurationReader cr = new ConfigurationReader();
		String browserName = cr.getBrowserName();
		driver = getBrowser(browserName);

	}

	@AfterClass
	public static void browserClose()
	{
		driver.close();
	}
}
