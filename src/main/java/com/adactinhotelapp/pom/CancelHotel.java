package com.adactinhotelapp.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CancelHotel {
	
	public static WebDriver driver;
	

	@FindBy(name = "cancelall")
	private WebElement cancel;


	public CancelHotel(WebDriver driver6) {
		this.driver=driver6;
		PageFactory.initElements(driver6, this);
		
	}


	public static WebDriver getDriver() {
		return driver;
	}


	public WebElement getCancel() {
		return cancel;
	}
	
	
	
}
