Feature: login functionality
@GuruBank
Scenario: login with valid details
Given user navigate to loginpage
And user enter valid email "mngr550546"
And user enter valid password "suhEnar"
Then user successfully in AccountPage