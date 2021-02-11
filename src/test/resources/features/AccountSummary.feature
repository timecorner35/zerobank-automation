Feature: Account Summary Page Features

  @wip
  Scenario: Check Account Summary Page Title
    Given the user is logged in
    Given the user accesses the "Account Summary" page
    Then page should have the title "Zero - Account Summary" activity.
    And the page should have following account types
      | Cash Accounts       |
      | Investment Accounts |
      | Credit Accounts     |
      | Loan Accounts       |
    And Credit Accounts table must have following columns
      | Account     |
      | Credit Card |
      | Balance     |



