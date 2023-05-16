$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("WomenTest.feature");
formatter.feature({
  "line": 1,
  "name": "Women Page Test",
  "description": "",
  "id": "women-page-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6716866600,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "I am on homepage",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 14,
  "name": "User should Sort by Price Filter",
  "description": "",
  "id": "women-page-test;user-should-sort-by-price-filter",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 13,
      "name": "@smoke"
    },
    {
      "line": 13,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "I mouse hover to Women menu",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "I mouse hover to Tops menu",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I click on Jackets menu",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I Select Sort By filter Price",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I should see products price display in Low to High",
  "keyword": "Then "
});
formatter.match({
  "location": "WomenTestSteps.iMouseHoverToWomenMenu()"
});
formatter.result({
  "duration": 2326017200,
  "status": "passed"
});
formatter.match({
  "location": "WomenTestSteps.iMouseHoverToTopsMenu()"
});
formatter.result({
  "duration": 145381500,
  "status": "passed"
});
formatter.match({
  "location": "WomenTestSteps.iClickOnJacketsMenu()"
});
formatter.result({
  "duration": 1273627400,
  "status": "passed"
});
formatter.match({
  "location": "WomenTestSteps.iSelectSortByFilterPrice()"
});
formatter.result({
  "duration": 17700,
  "status": "passed"
});
formatter.match({
  "location": "WomenTestSteps.iShouldSeeProductsPriceDisplayInLowToHigh()"
});
formatter.result({
  "duration": 3104130800,
  "status": "passed"
});
formatter.after({
  "duration": 685230300,
  "status": "passed"
});
});