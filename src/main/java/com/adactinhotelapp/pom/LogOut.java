package com.adactinhotelapp.pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOut {
	
	public static WebDriver driver;
	
	public LogOut(WebDriver driver7) {
		this.driver=driver7;
		PageFactory.initElements(driver7, this);
	}

	
	
	@FindBy(id = "logout")
	private WebElement logout;

	public static WebDriver getDriver() {
		return driver;
	}



	public WebElement getLogout() {
		return logout;
	}
	
	
}
