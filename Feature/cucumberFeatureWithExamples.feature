Feature: Log into twitter.com using valid credentials	

Scenario Outline: Successfully Logging into twitter.com using valid credentials
Given The User verifies if the login page of twitter.com is displayed
When The User enters the username as "<username>" and the password as "<password>"
Then The User verifies if the homepage is displayed
Then The User logs out of twitter.com

Examples:
    | username                | password |
    | rohithkumar90@ymail.com | rohith   |
