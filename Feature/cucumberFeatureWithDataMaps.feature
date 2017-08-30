Feature: Logging into twitter.com using data maps

Scenario: Log into twitter.com using the credentials
Given The login page of twitter.com is displayed
And The login Id and Password of the user is entered
| username                | password |
| rohithkumar90@ymail.com | rohith   |
When The home page of twitter.com is displayed
Then logout of twitter.com

