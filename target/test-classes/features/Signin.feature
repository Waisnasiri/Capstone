Feature: Sign In Feature

Background: 
Given User is on retail website
When User click on Sign in option

@Sigin
Scenario: Verify user can sign in into Retail Application
And User enter email 'qais@gmail.com' and password 'Tek@12345'
And User click on login button
Then User should be logged in into Account

@signUpTest
  Scenario: Verify user can create an account into Retail Website
    And User click on Create New Account button
    And User fill the signUp information with below data
      | name     | email                     | password  | confirmPassword |
      | panthers | panthersxy50@tekschool.us | Tek@12345 | Tek@12345       |
    And User click on SignUp button
    Then User should be logged into new account page







