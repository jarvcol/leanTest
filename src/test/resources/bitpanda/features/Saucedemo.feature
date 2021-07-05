Feature: Saucedemo feature

  Scenario: Login scenario
    Given a web browser is at the saucedemo homepage
    When the user performs a successful login
    Then the products listing page is shown

#  Scenario: Shorting articles
#    Given user has login successfully on saucedemo
#    When user selects "Lower price" sorting option
#    Then the products listing re-order according to "Lower price"
#
#  Scenario: Add Articles to Cart
#    Given user has login successfully on saucedemo
#    When the user selects an article pushing "Add to cart"
#    Then the article is added to the cart
#    And kart updates the article counter
#    And Add to cart button is updated
#
#  Scenario: Logout menu
#    Given user has login successfully on saucedemo
#    When user successfully logout
#    Then browser shows the homepage

  Scenario Outline: Buying articles by price order
    Given user has login successfully on saucedemo
    When user selects <sortOption> sorting option
    And user selects the first article
    And user goes to the cart
    And user completes the checkout process
    Then browser shows the order confirmation page
    Examples:
      | sortOption          |
      | Price (low to high) |
      | Price (high to low) |
