Feature: LoginAndSingUp feature

  As Bitpanda client
  I want to be able to get Sign in or Sign up
  So that I can buy stuff in

  Scenario: User lands on Sign up page when clicking on login button
    Given User enters the site home page
    When User clicks on login button
    Then User lands on the login page

  Scenario: Sign In a new user
    Given User enters the site home page
    And User clicks on login button
    When User performs a SigIn with credentials
      | email               | password         |
      | pandaTest@test.com  | pandaTest        |
    Then User lands on MyAccount page