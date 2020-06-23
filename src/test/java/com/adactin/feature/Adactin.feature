Feature: Testing hotel booking and cancellation functionalities in adactin application

Background:
 Given the user logged in
 Then it goes for landing page


@SignInPage
Scenario Outline: Checking the valid username and password for login functionality
Given User launch  the adactin application
When User enter  "<Username>" as valid username
And User enter "<Password>" as valid password
And User enter the login button
Then It lands to homepage sucessfully


Examples:
|Username|Password|
|PavithraN|Pavi@2426|
|BALAJIGURU|EBCZX1|


@SearchHotel
Scenario: User searches the Hotel in the adactin application
When User enter "New York" as the Location of the Hotel
And User enter "Hotel Sunshine" as the Hotel name
And User enter "Deluxe" as the Room Type
And User enter "2" as the number of rooms
And User enter "03/06/2020" as the check in date
And User enter "04/06/2020" the check out date
And User enter "3" as the adults per room
And User enter "3" as the  childs per room
And User clicks the search button
Then The Hotel is searched sucessfully

@SelectHotel
Scenario: User selects the Hotel
When User verfies and confirms the selected hotel
And User clicks the continue button
Then The Hotel is selected successfully

@BookingHHotel
Scenario: User Books a Hotel
When User enter "BALAJI" as the first name
And User enter "GURUMURTHY" as the last name
And User enter "No: 120 ,Brindhavan Towers, KK-Nagar, Chennai-78" as the billing address
And User enter "0123-1238-5634-6251" as the credit card number
And User enter "VISA" as the credit card type
And User enter "4" as the expiry month of credit card
And User enter "2014" as the expiry year of credit card
And User enter "450" as the CVV of the credit card
And User clicks the booknow button
Then It lands to the booking page successfully






@BookConfirmPage
Scenario: User confirms the booked Hotel
When User selects the My Itinerary and confirms the booking
Then It lands to the booking confirm  page successfully

@CanelHotel
Scenario: User cancels the Booked room in Hotel
When User searched the booked room
And User confirms the Hotel which has to be Cancelled
Then It lands to the booking itinerary page successfully

@LogOutPage
Scenario: User logout from adactin application
When User selects the logout option
When User closes the Adactin application
Then User has been loggged out sucessfully


