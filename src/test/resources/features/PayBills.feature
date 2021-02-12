Feature: Pay Bills Page Features

  Background:
    Given the user is logged in
    Given the user accesses the "Pay Bills" page
    Then page should have the title "Zero - Pay Bills" activity.

  Scenario: Making Paymenet successfully
    When user choose all combination of payee and amount
    Then "The payment was successfully submitted." should be displayed

  Scenario Outline: Making Paymenet without filling fields
    When user uses following "<amount>" and "<date>"
    Then "Please fill in this field." message should be displated
    Examples:
      | amount | date       |
      |        | 2021-02-02 |
      | 100    |            |
      |        |            |

  Scenario Outline: Date and amount shouldn't accept invalid inputs
    When user put invalid "<characters>" into date and amount
    Then Inputboxes shouldn't take these entries
    Examples:
      | characters |
      | abcde      |
      | abc£%      |
      | 1  3       |


