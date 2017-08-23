Feature: Log into twitter.com

Scenario: Successfully logging into twitter.com using valid user credentials
Given The User verifies if the Login page is displayed
When The User enters the username as "rohithkumar90@ymail.com" and password as "rohith"
Then The User verifies if the Homepage is displayed
Then The User logs out of the application

Scenario: Unsuccuessful login using invalid user credentials
Given The User verifies if the Login page is displayed
When The User enters the username as "rohithkumar90@ymail.com" and password as "abcdef"
Then The User verifies if the invalid credentials message is displayed




