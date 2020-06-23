package com.adactinhotelapp.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
	
	public static WebDriver driver;


	private WebDriver ldriver;
	
	public SignInPage(WebDriver ldriver) {
		
			this.driver=ldriver;
		    PageFactory.initElements(driver, this);
		}
		


		@FindBy(id = "username")
		private WebElement username;
		
		
	   @FindBy(id = "password")
	   private WebElement password;
	  
	  
       @FindBy(id = "login")
       private WebElement login;



	public WebElement getUsername() {
		return username;
	}


	public WebElement getPassword() {
		return password;
	}


	public WebElement getLogin() {
		return login;
	}
}
