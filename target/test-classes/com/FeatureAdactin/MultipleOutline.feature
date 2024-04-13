Feature: Hotel Booking in Adactin Application

@MultipleLLogin
Scenario Outline: User Launch the Application 
Given user Launch the Adactin Application
When user enter the "<UserName>" in Username field
Then user enter the "<Password>" in password field
Then user click the login in button

Examples:
 	|UserName|Password|
 	|mohammedfazil|fazil12345|
 	|David7358|David@7358|