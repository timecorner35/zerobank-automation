Feature: Pay Bills Page Features

  Background:
    Given the user is logged in
    Given the user accesses the "Pay Bills" page


  Scenario: Check Pay Bills Page Title
    Then page should have the title "Zero - Pay Bills" activity.

  @wip
  Scenario: Making Paymenet successfully
    And user choose all combination of payee and amount
    Then "The payment was successfully submitted." should be displayed