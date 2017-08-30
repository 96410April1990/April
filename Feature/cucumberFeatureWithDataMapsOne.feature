Feature: Logging into salesforce.com

Scenario: Enter the details of the user in salesforce.com
Given The signup page of salesforce.com is displayed
When The user enters the firstname, lastname and the mail id
| firstName | lastName   | mailId                  |
| Rohith    | Nandakumar | rohithkumar90@ymail.com |
Then The user selects the role, company and the country
| company 											 | 
| Cognizant Technology Solutions | 
Then The user enters the postal code and the username
| zipCode | userName        | 
| 600087  | RohithKumar1990 |
Then The user does not signup and closes the browser


