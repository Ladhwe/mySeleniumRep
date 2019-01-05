
Feature: Readiff login feature verifcation
  
  Scenario: Rediff Login
    Given User should be on login page
    When Login page should be displayed
    When user can provide user and password and sign in
    Then User should login successfully
    And Home page is displayed

 