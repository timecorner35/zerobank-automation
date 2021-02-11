Feature: Pay Bills Page Features

  Background:
    Given the user is logged in
    Given the user accesses the "Pay Bills" page

@wip
  Scenario: Check Pay Bills Page Title
    Then page should have the title "Zero - Pay Bills" activity.

  Scenario: Making Paymenet successfully
    When user fills all required fields
    Then "The payment was successfully submitted." should be displayed