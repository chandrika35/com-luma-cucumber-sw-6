Feature: Women Page Test

  Background: I am on homepage

  @sanity @regression
  Scenario: User should Sort by Product Name Filter
    When I mouse hover to Women menu
    And I mouse hover to Tops menu
    And I click on Jackets menu
    And I Select Sort By filter Product Name
    Then I should see products name display in alphabetical order

  @smoke @regression
  Scenario: User should Sort by Price Filter
    When I mouse hover to Women menu
    And I mouse hover to Tops menu
    And I click on Jackets menu
    And I Select Sort By filter Price
    Then I should see products price display in Low to High