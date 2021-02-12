Feature: Account Activity Page Features


  Scenario: Check Account Activity Page Title
    Given the user is logged in
    Given the user accesses the "Account Activity" page
    Then page should have the title "Zero - Account Activity" activity.
    Then Account drop down should have Savings selected
    Then Account dropdown should have following options
      | Savings     |
      | Checking    |
      | Loan        |
      | Credit Card |
      | Brokerage   |
    Then Transactions table should have column names
      | Date        |
      | Description |
      | Deposit     |
      | Withdrawal  |
