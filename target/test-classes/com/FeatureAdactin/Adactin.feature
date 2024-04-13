Feature: Hotel Booking in Adactin Application

@Login
Scenario: User Launch the Application 
Given user Launch the Adactin Application
When user enter the Username in Username field
Then user enter the passworrd in password field
Then user click the login in button

@Searchhotel
Scenario: User select Hotel from Search Hotel page
When user select the location in Location Field
Then user select the hotel in hotel Field
Then user select the roomtype in roomtype Field
Then user select the NoOfRooms in NoOfRooms Field
Then user select the CheckinDate in CheckinDate Field
Then user select the CheckOutDate in CheckOutDate Field
Then user select the AdultsRoom in AdultsRoom Field
Then user select the ChildrenRoom in ChildrenRoom Field
And user click the Search button in searchhotel page and its navigate to select hotel 

@selectHotel
Scenario: User select Hotel from Search Hotel page
When user select the hotel in  select Hotel Field
And user click the continue  button in search hotelpage 

@UserDetail
Scenario: User enter details in book hotel page
When user enter the firstname in firstname field
Then user enter the lastname in lastname field
Then user enter the address in billing address  field
Then user enter the card no in crCard  field 
Then user select the cardtype in  crCard type Field
Then user select the month in ExpiryDate Field
Then user select the year in ExpiryDate Field
Then user enter the  Cvv no in cvv field 
And user click the booknow  button in book hotelpage and its navigate to booking cofirmation page
And user click the itenerary button in booking confirmation page










