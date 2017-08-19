Feature: Log into twitter.com 
	
Scenario: Successful Login with valid credentials
Given The User verifies if the Login page is displayed
When The User enter the username and password
Then The User verifies if the Homepage is displayed	
Then The User logs out of the application 


