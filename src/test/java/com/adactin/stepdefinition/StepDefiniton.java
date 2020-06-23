package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.runner.Runner;
import com.adactin.utility.ConfigurationReader;
import com.adactinhotelapp.pom.BookItinerary;
import com.adactinhotelapp.pom.BookingConfirmPage;
import com.adactinhotelapp.pom.BookingHotel;
import com.adactinhotelapp.pom.LogOut;
import com.adactinhotelapp.pom.SearchHotel;
import com.adactinhotelapp.pom.SelectHotel;
import com.adactinhotelapp.pom.SignInPage;
import com.cucumber.baseclass.Baseclass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefiniton extends Baseclass {
	
	public static WebDriver driver=Runner.driver;
	
	@Given("^the user logged in$")
	public void the_user_logged_in() throws Throwable {
	    System.out.println("Logged in successfully");
	}

	@Then("^it goes for landing page$")
	public void it_goes_for_landing_page() throws Throwable {
	    System.out.println("Landed in HomePage successfully");
	}
	
	@Given("^User launch  the adactin application$")
	public void user_launch_the_adactin_application() throws Throwable {
		driver=getBrowser("chrome");
		driver.get("https://adactinhotelapp.com");
	}

	  
	

   @When("^User enter  \"([^\"]*)\" as valid username$")
   public void user_enter_as_valid_username(String username) throws Throwable {
	   SignInPage sp = new SignInPage(driver);
	inputValuestoWebelement(sp.getUsername(), username);
  }

   @When("^User enter \"([^\"]*)\" as valid password$")
   public void user_enter_as_valid_password(String password) throws Throwable {
	   SignInPage sp = new SignInPage(driver);
	inputValuestoWebelement(sp.getPassword(), password);
   }
   
   
   @When("^User enter the login button$")
	public void user_enter_the_login_button1() throws Throwable {
		SignInPage sp = new SignInPage(driver);
		clickonWebelement(sp.getLogin());
	    
	}

	@Then("^It lands to homepage sucessfully$")
	public void it_lands_to_homepage_sucessfully1() throws Throwable {
		System.out.println("Homepage loaded");
	    
	}


/*
 * @When("^User enter the valid username$") public void
 * user_enter_the_valid_username() throws Throwable { 
 * SignInPage sp = new SignInPage(driver); 
 * inputValuestoWebelement(sp.getUsername(), "PavithraN");
 * 
 * }
 * 
 * @When("^User enter the valid password$") 
 * public void  user_enter_the_valid_password() throws Throwable { 
 * SignInPage sp = new SignInPage(driver); 
 * inputValuestoWebelement(sp.getPassword(), "Pavi@2426");
 * 
 * }
 */
   
   
   @When("^User enter \"([^\"]*)\" as the Location of the Hotel$")
   public void user_enter_as_the_Location_of_the_Hotel(String location) throws Throwable {
	   SearchHotel sh= new SearchHotel(driver);
		selectDropDownOption(sh.getLocation(), "value", location);
       
   }

   @When("^User enter \"([^\"]*)\" as the Hotel name$")
   public void user_enter_as_the_Hotel_name(String hotelname) throws Throwable {
	   SearchHotel sh= new SearchHotel(driver);
		selectDropDownOption(sh.getHotels(), "value", hotelname);
   }

   @When("^User enter \"([^\"]*)\" as the Room Type$")
   public void user_enter_as_the_Room_Type(String roomtype) throws Throwable {
	   SearchHotel sh= new SearchHotel(driver);
		selectDropDownOption(sh.getRoom(), "value", roomtype );
   }

   @When("^User enter \"([^\"]*)\" as the number of rooms$")
   public void user_enter_as_the_number_of_rooms(String noofrooms) throws Throwable {
	   SearchHotel sh= new SearchHotel(driver);
		selectDropDownOption(sh.getRoomno(), "value", noofrooms);
   }

   @When("^User enter \"([^\"]*)\" as the check in date$")
   public void user_enter_as_the_check_in_date(String checkindate) throws Throwable {
	   SearchHotel sh= new SearchHotel(driver);
		inputValuestoWebelement(sh.getCheckin(), checkindate);
   }

   @When("^User enter \"([^\"]*)\" the check out date$")
   public void user_enter_the_check_out_date(String checkoutdate) throws Throwable {
	   SearchHotel sh= new SearchHotel(driver);
		inputValuestoWebelement(sh.getCheckout(), checkoutdate);
   }

   @When("^User enter \"([^\"]*)\" as the adults per room$")
   public void user_enter_as_the_adults_per_room(String adults) throws Throwable {
	   SearchHotel sh= new SearchHotel(driver);
		selectDropDownOption(sh.getAdult(), "value" , adults);
   }

   @When("^User enter \"([^\"]*)\" as the  childs per room$")
   public void user_enter_as_the_childs_per_room(String childs) throws Throwable {
	   SearchHotel sh= new SearchHotel(driver);
		selectDropDownOption(sh.getChild(), "value", childs);
   }



	
	

	/*
	 * @When("^User enter the Location of the Hotel$") public void
	 * user_enter_the_Location_of_the_Hotel() throws Throwable { SearchHotel sh= new
	 * SearchHotel(driver); selectDropDownOption(sh.getLocation(), "value",
	 * "New York"); }
	 */

	
	/*
	 * @When("^User enter the Hotel name$") public void user_enter_the_Hotel_name()
	 * throws Throwable { SearchHotel sh= new SearchHotel(driver);
	 * selectDropDownOption(sh.getHotels(), "value", "Hotel Sunshine");
	 * 
	 * 
	 * }
	 */
	
	
	/*
	 * @When("^User enter the Room Type$") public void user_enter_the_Room_Type()
	 * throws Throwable { SearchHotel sh= new SearchHotel(driver);
	 * selectDropDownOption(sh.getRoom(), "value", "Deluxe" );
	 * 
	 * 
	 * }
	 */

	/*
	 * @When("^User enter the number of rooms$") public void
	 * user_enter_the_number_of_rooms() throws Throwable { SearchHotel sh= new
	 * SearchHotel(driver); selectDropDownOption(sh.getRoomno(), "value", "2"); }
	 * 
	 * @When("^User enter the check in date$") public void
	 * user_enter_the_check_in_date() throws Throwable { SearchHotel sh= new
	 * SearchHotel(driver); inputValuestoWebelement(sh.getCheckin(), "22/05/2020");
	 * }
	 * 
	 * @When("^User enter the check out date$") public void
	 * user_enter_the_check_out_date() throws Throwable { SearchHotel sh= new
	 * SearchHotel(driver); inputValuestoWebelement(sh.getCheckout(), "23/05/2020");
	 * 
	 * }
	 * 
	 * @When("^User enter the adults per room$") public void
	 * user_enter_the_adults_per_room() throws Throwable { SearchHotel sh= new
	 * SearchHotel(driver); selectDropDownOption(sh.getAdult(), "value" , "3");
	 * 
	 * }
	 * 
	 * @When("^User enter the  childs per room$") public void
	 * user_enter_the_childs_per_room() throws Throwable { SearchHotel sh= new
	 * SearchHotel(driver); selectDropDownOption(sh.getChild(), "value", "3");
	 * 
	 * }
	 */

	@When("^User clicks the search button$")
	public void user_clicks_the_search_button() throws Throwable {
		SearchHotel sh= new SearchHotel(driver);
		clickonWebelement(sh.getSubmit());

	}

	@Then("^The Hotel is searched sucessfully$")
	public void the_Hotel_is_searched_sucessfully() throws Throwable {
		System.out.println("Hotel is searched");
	    
	}

	@When("^User verfies and confirms the selected hotel$")
	public void user_verfies_and_confirms_the_selected_hotel() throws Throwable {
		SelectHotel s = new SelectHotel(driver);
		clickonWebelement(s.getRadiobtn());
	   
	}

	@When("^User clicks the continue button$")
	public void user_clicks_the_continue_button() throws Throwable {
		SelectHotel s = new SelectHotel(driver);
		clickonWebelement(s.getContinuebtn());
	    
	}

	@Then("^The Hotel is selected successfully$")
	public void the_Hotel_is_selected_successfully() throws Throwable {
		System.out.println("Hotel is booked");
	    
	}

	@When("^User enter \"([^\"]*)\" as the first name$")
	public void user_enter_as_the_first_name(String fname) throws Throwable {
		BookingHotel bh = new BookingHotel(driver);
		inputValuestoWebelement(bh.getFname(), fname);
	}
	@When("^User enter \"([^\"]*)\" as the last name$")
	public void user_enter_as_the_last_name(String lname) throws Throwable {
		BookingHotel bh = new BookingHotel(driver);
		inputValuestoWebelement(bh.getLname(), lname);
	    
	}
	    

	@When("^User enter \"([^\"]*)\" as the billing address$")
	public void user_enter_as_the_billing_address(String address) throws Throwable {
		BookingHotel bh = new BookingHotel(driver);
		inputValuestoWebelement(bh.getAddress(), address);
	}

	@When("^User enter \"([^\"]*)\" as the credit card number$")
	public void user_enter_as_the_credit_card_number(String cardnumber) throws Throwable {
		BookingHotel bh = new BookingHotel(driver);
		inputValuestoWebelement(bh.getCcnum(), cardnumber);
	}

	@When("^User enter \"([^\"]*)\" as the credit card type$")
	public void user_enter_as_the_credit_card_type(String cardtype) throws Throwable {
		BookingHotel bh = new BookingHotel(driver);
		selectDropDownOption(bh.getCctype(), "value", cardtype);
	}

	@When("^User enter \"([^\"]*)\" as the expiry month of credit card$")
	public void user_enter_as_the_expiry_month_of_credit_card(String arg1) throws Throwable {
		BookingHotel bh = new BookingHotel(driver);
		selectDropDownOption(bh.getCcmonth(), "value", "4");
	}

	@When("^User enter \"([^\"]*)\" as the expiry year of credit card$")
	public void user_enter_as_the_expiry_year_of_credit_card(String exdate) throws Throwable {
		BookingHotel bh = new BookingHotel(driver);
		selectDropDownOption(bh.getCcyear(), "value", exdate);
	}

	@When("^User enter \"([^\"]*)\" as the CVV of the credit card$")
	public void user_enter_as_the_CVV_of_the_credit_card(String cvv) throws Throwable {
		BookingHotel bh = new BookingHotel(driver);
		inputValuestoWebelement(bh.getCccvv(), cvv);

	}


	/*
	 * @When("^User enter the first name$") public void user_enter_the_first_name()
	 * throws Throwable { BookingHotel bh = new BookingHotel(driver);
	 * inputValuestoWebelement(bh.getFname(), "BALAJI"); }
	 * 
	 * @When("^User enter the last name$") public void user_enter_the_last_name()
	 * throws Throwable { BookingHotel bh = new BookingHotel(driver);
	 * inputValuestoWebelement(bh.getLname(), "GURUMURTHY");
	 * 
	 * }
	 * 
	 * @When("^User enter the billing address$") public void
	 * user_enter_the_billing_address() throws Throwable { BookingHotel bh = new
	 * BookingHotel(driver); inputValuestoWebelement(bh.getAddress(),
	 * "No: 120 ,Brindhavan Towers, KK-Nagar, Chennai-78");
	 * 
	 * 
	 * }
	 * 
	 * @When("^User enter the credit card number$") public void
	 * user_enter_the_credit_card_number() throws Throwable { BookingHotel bh = new
	 * BookingHotel(driver); inputValuestoWebelement(bh.getCcnum(),
	 * "0123-1238-5634-6251");
	 * 
	 * }
	 * 
	 * @When("^User enter the credit card type$") public void
	 * user_enter_the_credit_card_type() throws Throwable { BookingHotel bh = new
	 * BookingHotel(driver); selectDropDownOption(bh.getCctype(), "value", "VISA");
	 * 
	 * 
	 * }
	 * 
	 * @When("^User enter the expiry month of credit card$") public void
	 * user_enter_the_expiry_month_of_credit_card() throws Throwable { BookingHotel
	 * bh = new BookingHotel(driver); selectDropDownOption(bh.getCcmonth(), "value",
	 * "4");
	 * 
	 * }
	 * 
	 * @When("^User enter the expiry year of credit card$") public void
	 * user_enter_the_expiry_year_of_credit_card() throws Throwable { BookingHotel
	 * bh = new BookingHotel(driver); selectDropDownOption(bh.getCcyear(), "value",
	 * "2014");
	 * 
	 * 
	 * }
	 * 
	 * @When("^User enter the CVV of the credit card$") public void
	 * user_enter_the_CVV_of_the_credit_card() throws Throwable { BookingHotel bh =
	 * new BookingHotel(driver); inputValuestoWebelement(bh.getCccvv(), "450");
	 * 
	 * }
	 */
	@When("^User clicks the booknow button$")
	public void user_clicks_the_booknow_button() throws Throwable {
		BookingHotel bh = new BookingHotel(driver);
		clickonWebelement(bh.getBook());

	}

	@Then("^It lands to the booking page successfully$")
	public void it_lands_to_the_booking_page_successfully() throws Throwable {
		System.out.println("Booking Page loaded");
	  
	}

	@When("^User selects the My Itinerary and confirms the booking$")
	public void user_selects_the_My_Itinerary_and_confirms_the_booking() throws Throwable {
		BookingConfirmPage bp= new BookingConfirmPage(driver);
		clickonWebelement(bp.getItinerary());
	    
	}

	@Then("^It lands to the booking confirm  page successfully$")
	public void it_lands_to_the_booking_confirm_page_successfully() throws Throwable {
		System.out.println("Booking confirmation");
	   
	}

	@When("^User searched the booked room$")
	public void user_searched_the_booked_room() throws Throwable {
		BookItinerary bi= new BookItinerary(driver);
		clickonWebelement(bi.getCheckbox1());
	
	}

	@When("^User confirms the Hotel which has to be Cancelled$")
	public void user_confirms_the_Hotel_which_has_to_be_Cancelled() throws Throwable {
		BookItinerary bi= new BookItinerary(driver);
		clickonWebelement(bi.getCheckbox1());
	     confirmAlert("accept");
	    
	}

	@Then("^It lands to the booking itinerary page successfully$")
	public void it_lands_to_the_booking_itinerary_page_successfully() throws Throwable {
		System.out.println("Booking cancellation");
	    
	}

	@When("^User selects the logout option$")
	public void user_selects_the_logout_option() throws Throwable {
		LogOut lo=new LogOut(driver);
	    clickonWebelement(lo.getLogout());
	    
	}
	
	@When("^User closes the Adactin application$")
	public void user_closes_the_Adactin_application() throws Throwable {
		browserClose("close");
	}

	@Then("^User has been loggged out sucessfully$")
	public void user_has_been_loggged_out_sucessfully() throws Throwable {
		System.out.println("Homepage logged out");
	    
	}

	
	
}

	
	