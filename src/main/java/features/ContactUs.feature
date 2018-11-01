Feature: Contact Us Form Functionality 

Scenario Outline:Contact Us Form Validation
Given user is on Vacation Exotica homepage
When user clicks on hamburge icon 
And user clicks on Contact Us link 
And user clicks on GET IN TOUCH button
Then user enters name as "<name>" and enters emailid as "<emailid>" and enters Mobile as "<mobile>"  and enters city as "<city>"
Then user clicks on  SUBMIT button
Then user close the browser
    

Examples:
|name|emailid|mobile|city|
|mirumdummy|test@g.com|9422565858|dummytest|

