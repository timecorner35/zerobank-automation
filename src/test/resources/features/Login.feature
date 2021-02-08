
@wip
Feature: Users should be able to login


  Scenario: Login with valid credentials
    Given the user is on the login page
    When the user enters the valid username and password
    Then the user should be able to login


  Scenario: Login with invalid credentials
    Given the user is on the login page
    When the user enters the invalid username and password
    Then "Login and/or password are wrong." message should be displayed


  Scenario: Login with invalid credentials
    Given the user is on the login page
    When the user enters the blank username and correct password
    Then "Login and/or password are wrong." message should be displayed


  Scenario: Login with invalid credentials
    Given the user is on the login page
    When the user enters the correct username and blank password
    Then "Login and/or password are wrong." message should be displayed

  Scenario: Login with invalid credentials
    Given the user is on the login page
    When the user enters the blank username and blank password
    Then "Login and/or password are wrong." message should be displayed
