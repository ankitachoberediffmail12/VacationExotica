Feature: Get In Touch Form Functionality 

@validategetintouch
Scenario Outline:To check “Submit” button click functionality with valid and invalid data
Given Vacation Exotica home page
When user clicks on Quick Enquiry icon 
And enters name as "<name>" And enters emailid as "<emailid>" And enters Mobile as "<mobile>"  and enters city as "<city>" And enters destination as "<destination>" And enters add. req. as "<addreq.>" and select permissions
Then @validatemobilenumber
And click on submit button
    

Examples:
|name|emailid|mobile|city|destination|addreq.|
|test|test@g.com|8652846290|test|test|test|

@validatemobilenumber
Scenario: To validate mobile number
When user enters mobile number and click on Send OTP button
Then user enters OTP and verify OTP by clicking on Verify OTP button
