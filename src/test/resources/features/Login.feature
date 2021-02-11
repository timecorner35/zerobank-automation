Feature: Users should be able to login

  Background:
    Given the user is on the login page

  Scenario: Login with valid credentials
    When the user enters the valid username and password
    Then the user should be able to login

  @wip
  Scenario Outline: Login with invalid credentials
    When the user logs in following "<username>" and "<password>"
    Then "Login and/or password are wrong." message should be displayed
    Examples:
      | username | password |
      |          | password |
      | username |          |
      | stre     | saet     |

