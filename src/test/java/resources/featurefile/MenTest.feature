Feature: Men Page Test

  @sanity @regression
  Scenario: User Should Add Product to Cart Successfully
    Given I am on homepage
    When I mouse hover Men menu
    And I mouse hover on Bottoms menu
    And I click on Pant menu
    Then I mouse hover on product name Cronus Yoga Pant and click on size 32
    And I mouse hover on Cronus Yoga Pant and click on colour Black
    And I mouse hover on Cronus Yoga Pant and click on Add To Cart Button
    Then I should see message You added Cronus Yoga Pant to your shopping cart.
    And I click on Shopping cart link into that message
    Then I should see text Shopping cart
    And I should see that product name Cronus Yoga Pant
    And I should see product size is 32
    And I should see product colour Black