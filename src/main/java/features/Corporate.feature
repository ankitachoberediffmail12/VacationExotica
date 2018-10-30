Feature: Corporate Form Validation

Scenario Outline: Corporate form validation 
Given user is on homepage
When user clicks on corporate button on homepage
Then user enters company as "<companyname>" and name as "<name>" and mobile as "<mobile>" and emailid as "<email>" and city as "<city>"
Then user selects occasion 
Then user clicks on submit button 
Then user clicks on OK button on error popup 
Then close the browser

Examples: 
		| companyname | name | mobile | email | city |
		| Mirum | Test | 9099999999 | test@gmail.com | Mumbai |