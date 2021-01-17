Feature: Login feature

  As rabobank client
  I want to be able to get my financial overview data
  So that I can have a clearer understanding of my financial state

  Scenario: Validate api response when user calls the financial overview endpoint
    Given User enters the site home page
    When User clicks on login button
    Then User lands on the login page