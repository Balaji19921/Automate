$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Testing hotel booking and cancellation functionalities in adactin application",
  "description": "",
  "id": "testing-hotel-booking-and-cancellation-functionalities-in-adactin-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 9,
  "name": "Checking the valid username and password for login functionality",
  "description": "",
  "id": "testing-hotel-booking-and-cancellation-functionalities-in-adactin-application;checking-the-valid-username-and-password-for-login-functionality",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 8,
      "name": "@SignInPage"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "User launch  the adactin application",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "User enter  \"\u003cUsername\u003e\" as valid username",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User enter \"\u003cPassword\u003e\" as valid password",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User enter the login button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "It lands to homepage sucessfully",
  "keyword": "Then "
});
formatter.examples({
  "line": 17,
  "name": "",
  "description": "",
  "id": "testing-hotel-booking-and-cancellation-functionalities-in-adactin-application;checking-the-valid-username-and-password-for-login-functionality;",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ],
      "line": 18,
      "id": "testing-hotel-booking-and-cancellation-functionalities-in-adactin-application;checking-the-valid-username-and-password-for-login-functionality;;1"
    },
    {
      "cells": [
        "PavithraN",
        "Pavi@2426"
      ],
      "line": 19,
      "id": "testing-hotel-booking-and-cancellation-functionalities-in-adactin-application;checking-the-valid-username-and-password-for-login-functionality;;2"
    },
    {
      "cells": [
        "BALAJIGURU",
        "EBCZX1"
      ],
      "line": 20,
      "id": "testing-hotel-booking-and-cancellation-functionalities-in-adactin-application;checking-the-valid-username-and-password-for-login-functionality;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 843792,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "the user logged in",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "it goes for landing page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefiniton.the_user_logged_in()"
});
formatter.result({
  "duration": 371307239,
  "status": "passed"
});
formatter.match({
  "location": "StepDefiniton.it_goes_for_landing_page()"
});
formatter.result({
  "duration": 198119,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Checking the valid username and password for login functionality",
  "description": "",
  "id": "testing-hotel-booking-and-cancellation-functionalities-in-adactin-application;checking-the-valid-username-and-password-for-login-functionality;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 8,
      "name": "@SignInPage"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "User launch  the adactin application",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "User enter  \"PavithraN\" as valid username",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User enter \"Pavi@2426\" as valid password",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User enter the login button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "It lands to homepage sucessfully",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefiniton.user_launch_the_adactin_application()"
});
formatter.result({
  "duration": 22520558893,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "PavithraN",
      "offset": 13
    }
  ],
  "location": "StepDefiniton.user_enter_as_valid_username(String)"
});
formatter.result({
  "duration": 1001725512,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Pavi@2426",
      "offset": 12
    }
  ],
  "location": "StepDefiniton.user_enter_as_valid_password(String)"
});
formatter.result({
  "duration": 619247289,
  "status": "passed"
});
formatter.match({
  "location": "StepDefiniton.user_enter_the_login_button1()"
});
formatter.result({
  "duration": 2521646318,
  "status": "passed"
});
formatter.match({
  "location": "StepDefiniton.it_lands_to_homepage_sucessfully1()"
});
formatter.result({
  "duration": 162422,
  "status": "passed"
});
formatter.after({
  "duration": 348940,
  "status": "passed"
});
formatter.before({
  "duration": 145912,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "the user logged in",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "it goes for landing page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefiniton.the_user_logged_in()"
});
formatter.result({
  "duration": 138773,
  "status": "passed"
});
formatter.match({
  "location": "StepDefiniton.it_goes_for_landing_page()"
});
formatter.result({
  "duration": 211506,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Checking the valid username and password for login functionality",
  "description": "",
  "id": "testing-hotel-booking-and-cancellation-functionalities-in-adactin-application;checking-the-valid-username-and-password-for-login-functionality;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 8,
      "name": "@SignInPage"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "User launch  the adactin application",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "User enter  \"BALAJIGURU\" as valid username",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User enter \"EBCZX1\" as valid password",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User enter the login button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "It lands to homepage sucessfully",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefiniton.user_launch_the_adactin_application()"
});
formatter.result({
  "duration": 33879576935,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "BALAJIGURU",
      "offset": 13
    }
  ],
  "location": "StepDefiniton.user_enter_as_valid_username(String)"
});
formatter.result({
  "duration": 745037870,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "EBCZX1",
      "offset": 12
    }
  ],
  "location": "StepDefiniton.user_enter_as_valid_password(String)"
});
formatter.result({
  "duration": 587940871,
  "status": "passed"
});
formatter.match({
  "location": "StepDefiniton.user_enter_the_login_button1()"
});
formatter.result({
  "duration": 1616421858,
  "status": "passed"
});
formatter.match({
  "location": "StepDefiniton.it_lands_to_homepage_sucessfully1()"
});
formatter.result({
  "duration": 261928,
  "status": "passed"
});
formatter.after({
  "duration": 315027,
  "status": "passed"
});
formatter.before({
  "duration": 232924,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "the user logged in",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "it goes for landing page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefiniton.the_user_logged_in()"
});
formatter.result({
  "duration": 236940,
  "status": "passed"
});
formatter.match({
  "location": "StepDefiniton.it_goes_for_landing_page()"
});
formatter.result({
  "duration": 200350,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "User searches the Hotel in the adactin application",
  "description": "",
  "id": "testing-hotel-booking-and-cancellation-functionalities-in-adactin-application;user-searches-the-hotel-in-the-adactin-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 23,
      "name": "@SearchHotel"
    }
  ]
});
formatter.step({
  "line": 25,
  "name": "User enter \"New York\" as the Location of the Hotel",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "User enter \"Hotel Sunshine\" as the Hotel name",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "User enter \"Deluxe\" as the Room Type",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "User enter \"2\" as the number of rooms",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "User enter \"03/06/2020\" as the check in date",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "User enter \"04/06/2020\" the check out date",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "User enter \"3\" as the adults per room",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "User enter \"3\" as the  childs per room",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "User clicks the search button",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "The Hotel is searched sucessfully",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "New York",
      "offset": 12
    }
  ],
  "location": "StepDefiniton.user_enter_as_the_Location_of_the_Hotel(String)"
});
formatter.result({
  "duration": 603221045,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hotel Sunshine",
      "offset": 12
    }
  ],
  "location": "StepDefiniton.user_enter_as_the_Hotel_name(String)"
});
formatter.result({
  "duration": 540056241,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Deluxe",
      "offset": 12
    }
  ],
  "location": "StepDefiniton.user_enter_as_the_Room_Type(String)"
});
formatter.result({
  "duration": 503735263,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 12
    }
  ],
  "location": "StepDefiniton.user_enter_as_the_number_of_rooms(String)"
});
formatter.result({
  "duration": 604353537,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "03/06/2020",
      "offset": 12
    }
  ],
  "location": "StepDefiniton.user_enter_as_the_check_in_date(String)"
});
formatter.result({
  "duration": 541588988,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "04/06/2020",
      "offset": 12
    }
  ],
  "location": "StepDefiniton.user_enter_the_check_out_date(String)"
});
formatter.result({
  "duration": 504406369,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 12
    }
  ],
  "location": "StepDefiniton.user_enter_as_the_adults_per_room(String)"
});
formatter.result({
  "duration": 457944718,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 12
    }
  ],
  "location": "StepDefiniton.user_enter_as_the_childs_per_room(String)"
});
formatter.result({
  "duration": 477204233,
  "status": "passed"
});
formatter.match({
  "location": "StepDefiniton.user_clicks_the_search_button()"
});
formatter.result({
  "duration": 1679568814,
  "status": "passed"
});
formatter.match({
  "location": "StepDefiniton.the_Hotel_is_searched_sucessfully()"
});
formatter.result({
  "duration": 167330,
  "status": "passed"
});
formatter.after({
  "duration": 194103,
  "status": "passed"
});
formatter.before({
  "duration": 230693,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "the user logged in",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "it goes for landing page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefiniton.the_user_logged_in()"
});
formatter.result({
  "duration": 245864,
  "status": "passed"
});
formatter.match({
  "location": "StepDefiniton.it_goes_for_landing_page()"
});
formatter.result({
  "duration": 182055,
  "status": "passed"
});
formatter.scenario({
  "line": 37,
  "name": "User selects the Hotel",
  "description": "",
  "id": "testing-hotel-booking-and-cancellation-functionalities-in-adactin-application;user-selects-the-hotel",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 36,
      "name": "@SelectHotel"
    }
  ]
});
formatter.step({
  "line": 38,
  "name": "User verfies and confirms the selected hotel",
  "keyword": "When "
});
formatter.step({
  "line": 39,
  "name": "User clicks the continue button",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "The Hotel is selected successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefiniton.user_verfies_and_confirms_the_selected_hotel()"
});
formatter.result({
  "duration": 504368888,
  "status": "passed"
});
formatter.match({
  "location": "StepDefiniton.user_clicks_the_continue_button()"
});
formatter.result({
  "duration": 1489940537,
  "status": "passed"
});
formatter.match({
  "location": "StepDefiniton.the_Hotel_is_selected_successfully()"
});
formatter.result({
  "duration": 170454,
  "status": "passed"
});
formatter.after({
  "duration": 1389513,
  "status": "passed"
});
formatter.before({
  "duration": 144574,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "the user logged in",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "it goes for landing page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefiniton.the_user_logged_in()"
});
formatter.result({
  "duration": 131187,
  "status": "passed"
});
formatter.match({
  "location": "StepDefiniton.it_goes_for_landing_page()"
});
formatter.result({
  "duration": 137880,
  "status": "passed"
});
formatter.scenario({
  "line": 43,
  "name": "User Books a Hotel",
  "description": "",
  "id": "testing-hotel-booking-and-cancellation-functionalities-in-adactin-application;user-books-a-hotel",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 42,
      "name": "@BookingHHotel"
    }
  ]
});
formatter.step({
  "line": 44,
  "name": "User enter \"BALAJI\" as the first name",
  "keyword": "When "
});
formatter.step({
  "line": 45,
  "name": "User enter \"GURUMURTHY\" as the last name",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "User enter \"No: 120 ,Brindhavan Towers, KK-Nagar, Chennai-78\" as the billing address",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "User enter \"0123-1238-5634-6251\" as the credit card number",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "User enter \"VISA\" as the credit card type",
  "keyword": "And "
});
formatter.step({
  "line": 49,
  "name": "User enter \"4\" as the expiry month of credit card",
  "keyword": "And "
});
formatter.step({
  "line": 50,
  "name": "User enter \"2014\" as the expiry year of credit card",
  "keyword": "And "
});
formatter.step({
  "line": 51,
  "name": "User enter \"450\" as the CVV of the credit card",
  "keyword": "And "
});
formatter.step({
  "line": 52,
  "name": "User clicks the booknow button",
  "keyword": "And "
});
formatter.step({
  "line": 53,
  "name": "It lands to the booking page successfully",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "BALAJI",
      "offset": 12
    }
  ],
  "location": "StepDefiniton.user_enter_as_the_first_name(String)"
});
formatter.result({
  "duration": 767158960,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "GURUMURTHY",
      "offset": 12
    }
  ],
  "location": "StepDefiniton.user_enter_as_the_last_name(String)"
});
formatter.result({
  "duration": 766277686,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "No: 120 ,Brindhavan Towers, KK-Nagar, Chennai-78",
      "offset": 12
    }
  ],
  "location": "StepDefiniton.user_enter_as_the_billing_address(String)"
});
formatter.result({
  "duration": 1333858230,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "0123-1238-5634-6251",
      "offset": 12
    }
  ],
  "location": "StepDefiniton.user_enter_as_the_credit_card_number(String)"
});
formatter.result({
  "duration": 690416738,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "VISA",
      "offset": 12
    }
  ],
  "location": "StepDefiniton.user_enter_as_the_credit_card_type(String)"
});
formatter.result({
  "duration": 469636433,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "4",
      "offset": 12
    }
  ],
  "location": "StepDefiniton.user_enter_as_the_expiry_month_of_credit_card(String)"
});
formatter.result({
  "duration": 635911175,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2014",
      "offset": 12
    }
  ],
  "location": "StepDefiniton.user_enter_as_the_expiry_year_of_credit_card(String)"
});
formatter.result({
  "duration": 448606338,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "450",
      "offset": 12
    }
  ],
  "location": "StepDefiniton.user_enter_as_the_CVV_of_the_credit_card(String)"
});
formatter.result({
  "duration": 1136899094,
  "status": "passed"
});
formatter.match({
  "location": "StepDefiniton.user_clicks_the_booknow_button()"
});
formatter.result({
  "duration": 639786102,
  "status": "passed"
});
formatter.match({
  "location": "StepDefiniton.it_lands_to_the_booking_page_successfully()"
});
formatter.result({
  "duration": 210166,
  "status": "passed"
});
formatter.after({
  "duration": 215968,
  "status": "passed"
});
formatter.before({
  "duration": 312797,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "the user logged in",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "it goes for landing page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefiniton.the_user_logged_in()"
});
formatter.result({
  "duration": 182502,
  "status": "passed"
});
formatter.match({
  "location": "StepDefiniton.it_goes_for_landing_page()"
});
formatter.result({
  "duration": 141450,
  "status": "passed"
});
formatter.scenario({
  "line": 61,
  "name": "User confirms the booked Hotel",
  "description": "",
  "id": "testing-hotel-booking-and-cancellation-functionalities-in-adactin-application;user-confirms-the-booked-hotel",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 60,
      "name": "@BookConfirmPage"
    }
  ]
});
formatter.step({
  "line": 62,
  "name": "User selects the My Itinerary and confirms the booking",
  "keyword": "When "
});
formatter.step({
  "line": 63,
  "name": "It lands to the booking confirm  page successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefiniton.user_selects_the_My_Itinerary_and_confirms_the_booking()"
});
formatter.result({
  "duration": 8058408602,
  "status": "passed"
});
formatter.match({
  "location": "StepDefiniton.it_lands_to_the_booking_confirm_page_successfully()"
});
formatter.result({
  "duration": 299857,
  "status": "passed"
});
formatter.after({
  "duration": 199904,
  "status": "passed"
});
formatter.before({
  "duration": 186517,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "the user logged in",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "it goes for landing page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefiniton.the_user_logged_in()"
});
formatter.result({
  "duration": 168669,
  "status": "passed"
});
formatter.match({
  "location": "StepDefiniton.it_goes_for_landing_page()"
});
formatter.result({
  "duration": 269067,
  "status": "passed"
});
formatter.scenario({
  "line": 66,
  "name": "User cancels the Booked room in Hotel",
  "description": "",
  "id": "testing-hotel-booking-and-cancellation-functionalities-in-adactin-application;user-cancels-the-booked-room-in-hotel",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 65,
      "name": "@CanelHotel"
    }
  ]
});
formatter.step({
  "line": 67,
  "name": "User searched the booked room",
  "keyword": "When "
});
formatter.step({
  "line": 68,
  "name": "User confirms the Hotel which has to be Cancelled",
  "keyword": "And "
});
formatter.step({
  "line": 69,
  "name": "It lands to the booking itinerary page successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefiniton.user_searched_the_booked_room()"
});
formatter.result({
  "duration": 819507522,
  "status": "passed"
});
formatter.match({
  "location": "StepDefiniton.user_confirms_the_Hotel_which_has_to_be_Cancelled()"
});
formatter.result({
  "duration": 2282539979,
  "status": "passed"
});
formatter.match({
  "location": "StepDefiniton.it_lands_to_the_booking_itinerary_page_successfully()"
});
formatter.result({
  "duration": 240509,
  "status": "passed"
});
formatter.after({
  "duration": 173577,
  "status": "passed"
});
formatter.before({
  "duration": 207936,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "the user logged in",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "it goes for landing page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefiniton.the_user_logged_in()"
});
formatter.result({
  "duration": 190534,
  "status": "passed"
});
formatter.match({
  "location": "StepDefiniton.it_goes_for_landing_page()"
});
formatter.result({
  "duration": 145466,
  "status": "passed"
});
formatter.scenario({
  "line": 72,
  "name": "User logout from adactin application",
  "description": "",
  "id": "testing-hotel-booking-and-cancellation-functionalities-in-adactin-application;user-logout-from-adactin-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 71,
      "name": "@LogOutPage"
    }
  ]
});
formatter.step({
  "line": 73,
  "name": "User selects the logout option",
  "keyword": "When "
});
formatter.step({
  "line": 74,
  "name": "User closes the Adactin application",
  "keyword": "When "
});
formatter.step({
  "line": 75,
  "name": "User has been loggged out sucessfully",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefiniton.user_selects_the_logout_option()"
});
formatter.result({
  "duration": 1930398550,
  "status": "passed"
});
formatter.match({
  "location": "StepDefiniton.user_closes_the_Adactin_application()"
});
formatter.result({
  "duration": 2468005519,
  "status": "passed"
});
formatter.match({
  "location": "StepDefiniton.user_has_been_loggged_out_sucessfully()"
});
formatter.result({
  "duration": 179825,
  "status": "passed"
});
formatter.after({
  "duration": 156621,
  "status": "passed"
});
});