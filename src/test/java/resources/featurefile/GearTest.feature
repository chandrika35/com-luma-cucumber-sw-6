Feature: Gear Page Test

  @sanity @regression
  Scenario: User should add product to cart successfully
    Given I am on homepage
    When I mouse hover on Gear menu
    And I click on Bags tab
    And I click on Overnight Duffle
    Then I should see product name Overnight Duffle on that product page
    And I change Qty to 3
    And I click on Add to Cart
    Then I should see You added Overnight Duffle to your shopping cart.
    And I click on Shopping cart link into that message
    Then I should see product name Overnight Duffle
    And I should see Qty is 3
    And I should see price is $135.00
    And I change Qty 5
    And I click on Update Shopping cart
    Then I should see price $225.00