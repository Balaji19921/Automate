package com.adactinhotelapp.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BookingHotel {
	
	public static WebDriver driver;

	public BookingHotel(WebDriver driver4) {
		this.driver=driver4;
		PageFactory.initElements(driver4, this);
	}

	
	
	@FindBy(id = "first_name")
	private WebElement fname;
	
	@FindBy(id = "last_name")
	private WebElement lname;
	
	
	@FindBy(id = "address")
	private WebElement address;
	
	@FindBy(id = "cc_num")
	private WebElement ccnum;
	
	@FindBy(id = "cc_type")
	private WebElement cctype;
	
	@FindBy(id = "cc_exp_month")
	private WebElement ccmonth;
	
	@FindBy(id = "cc_exp_year")
	private WebElement ccyear;
	
	@FindBy(id = "cc_cvv")
	private WebElement cccvv;
	
	@FindBy(id = "book_now")
	private WebElement book;

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCcnum() {
		return ccnum;
	}

	public WebElement getCctype() {
		
		return cctype;
	}

	public WebElement getCcmonth() {
		
		return ccmonth;
	}

	public WebElement getCcyear() {
		
		return ccyear;
	}

	public WebElement getCccvv() {
		return cccvv;
	}

	public WebElement getBook() {
		return book;
	}
	
	
	
}
