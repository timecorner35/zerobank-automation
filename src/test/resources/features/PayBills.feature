Feature: Pay Bills Page Features

  Scenario: Making Paymenet successfully
    Given the user is logged in
    Given the user accesses the "Pay Bills" page
    Then page should have the title "Zero - Pay Bills" activity.
    And user choose all combination of payee and amount
    Then "The payment was successfully submitted." should be displayed

  @wip
  Scenario Outline: Making Paymenet without filling fields
    Given the user is logged in
    Given the user accesses the "Pay Bills" page
    Then page should have the title "Zero - Pay Bills" activity.
    When user uses following "<amount>" and "<date>"
    Then "Please fill in this field." message should be displated
    Examples:
      | amount | date       |
      |        | 2021-02-02 |
      | 100    |            |
      |        |            |
