package com.adactinhotelapp.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirmPage {
	
	public BookingConfirmPage(WebDriver driver5) {
		this.driver=driver5;
		PageFactory.initElements(driver5, this);
	}



	public static WebDriver driver;
	
	
	
	@FindBy(id = "my_itinerary")
	private WebElement itinerary;



	public static WebDriver getDriver() {
		return driver;
	}



	public WebElement getItinerary() {
		return itinerary;
	}
	

}
