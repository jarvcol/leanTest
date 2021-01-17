Feature: SearchProducts feature

  As Bitpanda client
  I want to be able to look for products
  So that I find, review and buy the one I wish

  Scenario Outline: User search for products using the search box
    Given User enters the site home page
    When User searches for <term> using the search box
    Then Site displays the search <term> used
    And Results from search are shown in grid mode
    And Search tools are shown on the side
    Examples:
      | term     |
      | Blouses  |
      | T-shirts |

  Scenario: User search for products and add them to cart
    Given User enters the site home page
    When User searches for 'T-SHIRTS' using the search box
    And User adds directly one of the results to the cart
    And User selects to continue shopping
    Then Cart shows that there is one product in the list
    When User click on view cart button
    Then Cart page shows one product in the product summary


