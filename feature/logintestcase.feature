Feature: Login feature file for test case



@login
Scenario: User should not be able to login to the application

Given User is in login page
When User enters email id "sdf@gmail.com"
And User enters password "T@123"
And User clicks the signin button
Then User should see the error message
Then close application

@loginvalid
Scenario: User should able to login to the application

Given User is in login page
When User enters email id "prashanthi.skvl@gmail.com"
And User enters password "Test@123"
And User clicks the signin button
Then close application

@parameters
Scenario: User should able be in the application
Given User is in login page

@parameters
Scenario Outline: Title of your scenario outline

When User enters email id "<name>"
And User enters password "<password>"
And User clicks the signin button
Then User should see the error message

    Examples: 
      |name|password|
      |prashanthi.sk@gmail.com|Test@123|
      |prashanthi.s@gmail.com|Test@123|