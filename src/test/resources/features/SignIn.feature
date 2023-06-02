
@Capstone
Feature: Sign in Feature

  Background: 
    Given User is on retail website
    When User click on Sign in option

  
  Scenario: Verify user can sign in into Retail Application
    And User enter email 'student235@tekschool.us' and password 'Tek@School7'
    And User click on login button
    Then User should be logged in into Account

  
  Scenario: Verify user can create an account into Retail Website
    And User click on Create New Account button
    And User fill the signUp information with below data
      | name     | email                     | password   | confirmPassword |
      | students | newStudent9742@tekschool.us | Tek@12345! | Tek@12345!      |
    And User click on SignUp button
    Then User should be logged into account page
