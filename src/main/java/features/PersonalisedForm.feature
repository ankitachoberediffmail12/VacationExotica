Feature: Personalised Form Functionality 

Scenario Outline:To check “Submit” button click functionality with valid and invalid data
Given user is on home page
When user is on personalised form
And  name as "<name>" And enters emailid as "<emailid>" And enters Mobile as "<mobile>"  and enters city as "<city>" And enters destination as "<destination>" And enters add. req. as "<addreq.>" and select permissions
Then @validatemobilenumber
And click submit button
    

Examples:
|name|emailid|mobile|city|destination|addreq.|
#|test|test@g.com|8652846290|test|test|test|
#|123|testggom|xfd343|df434|434|434|
|  |  |  |  |  |  |

@validatemobilenumber
Scenario: To validate mobile number
When enters mobile number and click on Send OTP button
Then enters OTP and verify OTP by clicking on Verify OTP button