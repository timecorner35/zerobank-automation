Feature:
  Purchase Foreign Currency


  Scenario: Available currencies
    Given the user is logged in
    Given the user accesses the "Pay Bills" page
    Given user access "Purchase foreign currency" tab
    Then following currencies should be available
      | Australia (dollar)    |
      | Canada (dollar)       |
      | Switzerland (franc)   |
      | China (yuan)          |
      | Denmark (krone)       |
      | Eurozone (euro)       |
      | Great Britain (pound) |
      | Japan (yen)           |
      | Mexico (peso)         |
      | Norway (krone)        |
      | New Zealand (dollar)  |
      | Singapore (dollar)    |

  @wip
  Scenario: Error message for not selecting currency
    Given the user is logged in
    Given the user accesses the "Pay Bills" page
    Given user access "Purchase foreign currency" tab
    When user tries to calculate cost without selecting a currency
    Then error message should be displayed