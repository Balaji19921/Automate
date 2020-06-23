package com.adactinhotelapp.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel {

	
	public static WebDriver driver;
	
	@FindBy(id = "radiobutton_0")
	private WebElement radiobtn;
	
	
	@FindBy(id = "continue")
	private WebElement continuebtn;


	public SelectHotel(WebDriver driver3) {
		this.driver=driver3;
		PageFactory.initElements(driver3, this);
	}


	public static WebDriver getDriver() {
		return driver;
	}


	public WebElement getRadiobtn() {
		return radiobtn;
	}


	public WebElement getContinuebtn() {
		return continuebtn;
	}
	
	
	
	
}
