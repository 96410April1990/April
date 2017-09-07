Feature: Log into twitter.com with the data given in the data tables.

Scenario: Logging into twitter.com using the given credentials
Given The Login page is displayed
When The User enters the id and password
| rohithkumar90@ymail.com | rohithkumar |
Then verify if the home page is displayed
Then logout of the website


