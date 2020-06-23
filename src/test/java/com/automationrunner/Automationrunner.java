package com.automationrunner;



import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.SendKeysAction;
import org.testng.annotations.Test;

import com.adactinhotelapp.pom.BookItinerary;
import com.adactinhotelapp.pom.BookingConfirmPage;
import com.adactinhotelapp.pom.BookingHotel;
import com.adactinhotelapp.pom.CancelHotel;
import com.adactinhotelapp.pom.LogOut;
import com.adactinhotelapp.pom.SearchHotel;
import com.adactinhotelapp.pom.SelectHotel;
import com.adactinhotelapp.pom.SignInPage;
import com.cucumber.baseclass.Baseclass;


public class Automationrunner extends Baseclass
{
	public  WebDriver driver;

	@Test
	public void testing() throws Exception
{
	
	driver=getBrowser("chrome");
	driver.get("https://adactinhotelapp.com");
	
	SignInPage sp = new SignInPage(driver);
	inputValuestoWebelement(sp.getUsername(), "PavithraN");
	inputValuestoWebelement(sp.getPassword(), "Pavi@2426");
	clickonWebelement(sp.getLogin());
	
	SearchHotel sh= new SearchHotel(driver);
	selectDropDownOption(sh.getLocation(), "value", "New York");
	selectDropDownOption(sh.getHotels(), "value", "Hotel Sunshine");
	selectDropDownOption(sh.getRoom(), "value", "Deluxe" );
	selectDropDownOption(sh.getRoomno(), "value", "2");
	inputValuestoWebelement(sh.getCheckin(), "22/05/2020");
	inputValuestoWebelement(sh.getCheckout(), "23/05/2020");
	selectDropDownOption(sh.getAdult(), "value" , "3");
	selectDropDownOption(sh.getChild(), "value", "3");
	clickonWebelement(sh.getSubmit());

	
	SelectHotel s = new SelectHotel(driver);
	clickonWebelement(s.getRadiobtn());
	clickonWebelement(s.getContinuebtn());
	
	BookingHotel bh = new BookingHotel(driver);
	inputValuestoWebelement(bh.getFname(), "BALAJI");
	inputValuestoWebelement(bh.getLname(), "GURUMURTHY");
	inputValuestoWebelement(bh.getAddress(), "No: 120 ,Brindhavan Towers, KK-Nagar, Chennai-78");
	inputValuestoWebelement(bh.getCcnum(), "0123-1238-5634-6251");
	selectDropDownOption(bh.getCctype(), "value", "VISA");
	selectDropDownOption(bh.getCcmonth(), "value", "4");
	selectDropDownOption(bh.getCcyear(), "value", "2014");
	inputValuestoWebelement(bh.getCccvv(), "450");
	clickonWebelement(bh.getBook());
	
	BookingConfirmPage bp= new BookingConfirmPage(driver);
	clickonWebelement(bp.getItinerary());
	
	
    BookItinerary bi= new BookItinerary(driver);
    clickonWebelement(bi.getCheckbox1());
    
    
    CancelHotel ch= new CancelHotel(driver);
    clickonWebelement(ch.getCancel());
    confirmAlert("accept");
    
    LogOut lo=new LogOut(driver);
    clickonWebelement(lo.getLogout());
    
    browserClose("close");
			
}

	
	
	}


