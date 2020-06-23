package com.adactinhotelapp.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SearchHotel {
	public static WebDriver driver;
	
	public SearchHotel(WebDriver driver2) {
		
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	

	 @FindBy(id = "location")
	 private WebElement location;
	 
	 @FindBy(id = "hotels")
	 private WebElement hotels;
	 
	 @FindBy(id = "room_type")
	 private WebElement room;
	 
	 @FindBy(id = "room_nos")
	 private WebElement roomno;
	 
	 
	 @FindBy(id = "datepick_in")
	 private WebElement checkin;
	 
	 @FindBy(id = "datepick_out")
	 private WebElement checkout;
	 
	 @FindBy(id = "adult_room")
	 private WebElement adult;
	 
	 @FindBy(id = "child_room")
	 private WebElement child;

	 @FindBy(id = "Submit")
	 private WebElement submit;
	 
	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getLocation() {
		
		return location;
	}

	public WebElement getHotels() {
		
		return hotels;
	}

	public WebElement getRoom() {
		
		
		return room;
	}

	public WebElement getRoomno() {
		
		return roomno;
	}

	public WebElement getCheckin() {
		return checkin;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getAdult() {
		
		
		return adult;
	}

	public WebElement getChild() {
	
		return child;
	}
	 
	 
	 
}




