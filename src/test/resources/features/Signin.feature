Feature: Sign In Feature

  Background: 
    Given User is on retail website
    When User can click on sign in option

  @signinTest
  Scenario: Verify User can Sign in into Retail Application
    And User enter email 'nasirisahil@gmail.com' and password 'Sahil54321$@'
    And User click on login button
    Then User should be logged in into account

  @signinTest
  Scenario: Verify User can Sign in into Retail Application
    And User enter email 'nasiriasad@gmail.com' and password 'Asad12345$@'
    And User click on login button
    Then User should be logged in into account

  @signinTest
  Scenario: Verify User can Sign in into Retail Application
    And User enter email 'nasirihakif@gmail.com' and password 'Hakif12345$@''
    And User click on login button
    Then User should be logged in into account
